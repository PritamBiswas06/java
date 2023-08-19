import java.util.Arrays;
public class cyclic {
    public static void main(String[] args) {
        int[] arr ={3,5,2,1,4};
        pkk(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void pkk(int[] arr) {
        int i = 0;
        while (i < arr.length){
            if(i!=arr[i]-1){
                swap(arr,i,arr[i]-1);
                // continue;
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
