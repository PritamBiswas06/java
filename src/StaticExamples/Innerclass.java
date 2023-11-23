package StaticExamples;
//class Test{
//            String name;
//
//        public Test(String name) {
//            this.name = name;
//        }
//    }
public class Innerclass {
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test A = new Test("Pritam");
        Test B = new Test("Rahul");
        System.out.println(A.name);
        System.out.println(B.name);

    }
}
