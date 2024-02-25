package linkedList;

public class Main {
    public static void main(String[] args) {
        LL list =new LL();
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(10);
        list.insertLast(11);
//        list.insert(15,3);
        list.display();
        list.insertRec(5,3);
//        System.out.println(list.deleteLast());
        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//        System.out.println(list.find(11));
//        list.display();

//        DLL list2 =new DLL();
//        list2.insertFirst(4);
//        list2.insertFirst(3);
//        list2.insertFirst(2);
//        list2.insertFirst(1);
//        list2.display();
//        list2.insertLast(5);
//        list2.display();
//        list2.insert(6,5);
//        list2.display();
//        list2.insertAfterValue(2,10);
//        list2.display();



//        CLL list3=new CLL();
//        list3.insert(1);
//        list3.insert(2);
//        list3.insert(3);
//        list3.insert(4);
//        list3.display();
//        list3.deletebyIndex(0);
//        list3.display();
//        list3.delete(3);
//        list3.display();
    }
}
