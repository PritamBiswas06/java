package OOP;

public class WrapperClass {
    public static void main(String[] args) {
        A pritam = new A("Pritam");
        System.out.println(pritam.name);
        A obj;
        for (int i = 0; i < 5; i++) {
            obj = new A("Random Name");
        }
    }


}

class A{
    final int num=10;
    String name;

    public A(String name) {
        System.out.println("Object Created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
//        super.finalize();
        System.out.println("Object is destroyed");
    }
}
