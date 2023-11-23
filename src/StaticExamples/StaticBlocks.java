package StaticExamples;

public class StaticBlocks {
     static int a =5;
     static int b;

    //this block will run only once
    static {
        System.out.println("Hii i'm in static block");
        b=a*4;
    }

    public static void main(String[] args) {
        StaticBlocks obj1=new StaticBlocks();
        System.out.println(StaticBlocks.a+" "+StaticBlocks.b);
        StaticBlocks.b+=1;
        System.out.println(StaticBlocks.a+" "+StaticBlocks.b);
        StaticBlocks obj2=new StaticBlocks();
        System.out.println(StaticBlocks.a+" "+StaticBlocks.b);

    }
}
