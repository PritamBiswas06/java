import java.util.*;
public class reverse {
    public static void find3(int[] arr) {
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
            
        // return ans;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4};
        find3(arr);
        System.out.println(Arrays.toString(arr));

    }
}
