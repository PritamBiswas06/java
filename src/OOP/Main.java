package OOP;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(2,"Pritam",99f);
        Student Rahul =new Student(1,"Rahul",90f);
        Rahul.changeName("Cricket Lover");
        Rahul.greeting();
//        student1.rno=1;
        System.out.println(Rahul.rno);
        System.out.println(Rahul.name);
        System.out.println(Rahul.marks);
        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        Student random = new Student();
        System.out.println(random.name);
        random = new Student(1,"Hi",70);
        System.out.println(random.name);

        Student random2 = new Student(student1);
        System.out.println(random2.name);

        Student one = new Student();
        Student two=one;

        System.out.println(two.name);
        one.name="Epee";
        System.out.println(two.name);

    }
}
class Student{
    int rno;
    String name;
    float marks;

    void greeting() {
        System.out.println("Hii, my name is "+ name);
    }
    void changeName(String naam){
        name=naam;
    }
    Student(Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student() {
        this(0,"default person",100);
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}
