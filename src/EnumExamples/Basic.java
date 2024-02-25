package EnumExamples;

import interfaces.extendDemo.A;

import java.util.Arrays;

public class Basic {
    enum Week implements X{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;

        Week() {
            System.out.println("Constructor called for "+this);
        }

        @Override
        public void hello() {
            System.out.println("Hii guys");
        }
    }


    public static void main(String[] args) {
        Week week;
        week=Week.Monday;
        week.hello();
//        for (Week day:Week.values()){
//            System.out.println(day);
//        }
//        System.out.println(week);
//        System.out.println(week.ordinal());
//        System.out.println(Arrays.toString(Week.values()));
    }
}
