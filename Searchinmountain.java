public class Searchinmountain {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,3,1};
        int ans = search(array, 3);
        System.out.println(ans);

    }

    // https://leetcode.com/problems/find-in-mountain-array/
    public static int search(int[] array, int target) {
        int peak = peakIndexInMountainArray(array);
        int firstTry = orderAgnosticBS(array, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(array, target, peak + 1, array.length - 1);
    }

    public static int peakIndexInMountainArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (array[mid] > array[mid + 1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2
        // checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one
        // because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the
        // best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line
        // that is the best possible ans
        return start; // or return end as both are =
    }

    public static int orderAgnosticBS(int[] array, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = array[start] < array[end];

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds
            // the range of int in java
            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}