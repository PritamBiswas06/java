package backtracking;

import java.util.ArrayList;

public class ReturnPaths {
    public static void main(String[] args) {
//        count("",3,3);
//        System.out.println(countRet("",3,3));
        System.out.println(countDiagonal("",3,3));
    }
    static void count(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            count(p+"D",r-1,c);
        }
        if(c>1){
            count(p+"R",r,c-1);
        }
    }
    static ArrayList<String> countRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(countRet(p + "D", r - 1, c));
        }
        if (c > 1) {
            list.addAll(countRet(p + "R", r, c - 1));
        }
        return list;
    }


    static ArrayList<String> countDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (c>1 && r>1){
            list.addAll(countDiagonal(p + "D", r - 1, c));
        }
        if (r > 1) {
            list.addAll(countDiagonal(p + "V", r - 1, c));
        }
        if (c > 1) {
            list.addAll(countDiagonal(p + "H", r, c - 1));
        }
        return list;
    }


}
