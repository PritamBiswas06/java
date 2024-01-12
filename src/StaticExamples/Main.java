package StaticExamples;

public class Main {
    public static void main(String[] args) {
//        greeting();
        Main obj =new Main();
        obj.fun2();
        fun();
        System.out.println(StaticBlocks.a+" "+StaticBlocks.b);
//        System.out.println(obj1.a);

    }

    static void fun(){
        Main obj =new Main();
        obj.greeting();
    }
    void fun2(){
        greeting();
    }
    void greeting(){
        System.out.println("Hello");
    }
}

