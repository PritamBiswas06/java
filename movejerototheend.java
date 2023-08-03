import java.util.*;
public class movejerototheend {
    public static void find2(int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
            
        }
        while(count<arr.length){
                arr[count]=0;
                count++;
            }
        // System.out.print(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        // find2(new int[]{0,22,0,4,0});
        int[] arr = new int[]{0,4,0,2};
        find2(arr);
        System.out.print(Arrays.toString(arr));

        
    }
    
    
}
