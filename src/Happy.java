public class Happy {
    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }
    public static boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        int sum = 0;
//        if (n>2) {
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
//        }
//        else {
//            return false;
//        }
        return isHappy(sum);
        // return false;
    }
}
