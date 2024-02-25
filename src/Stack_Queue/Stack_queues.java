package Stack_Queue;

import java.util.*;

public class Stack_queues {
    public static void main(String[] args) throws StackException {
//        Stack<Integer> s=new Stack<Integer>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        s.push(5);
//
//        System.out.println(s.pop());
//        System.out.println(s.peek());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.peek());
//        s.remove(0);
//        System.out.println(s.peek());


//        Queue<Integer> q=new LinkedList<Integer>();
//            q.add(1);
//            q.add(2);
//            q.add(3);
//            q.add(4);
//
//            System.out.println(q.peek());
//            q.remove();
//            System.out.println(q.peek());

        StackCustomImplementation s=new StackCustomImplementation();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);


        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());



//        s.remove(0);
//        System.out.println(s.peek());

    }
}
