public class traingle {

    public static void mytraingle(Object[] arr) {
        for (int row=0;row<arr.length;row++) {
            for(int col=0;col<row;col++){
                System.out.print(arr[col]);

            }
            System.out.println();
            
        }
        
    }
    public static void main(String args[]) {
        // System.out.println("Hello, World!");
        Integer[] arr = new Integer[]{10,20,30,40,50,60};
        // mytraingle(new Integer[] {1,2,3,4,5});
        mytraingle(arr);
    }
}