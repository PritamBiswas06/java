package backtracking;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(0,0,2));
    }
    static int count(int r,int c,int n){
        if (r==n || c==n){
            return 1;
        }
        int left =count(r+1,c,n);
        int right = count(r,c+1,n);
        return left+right;
    }
}
