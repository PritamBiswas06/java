package linkedList;



public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        Node node =new Node(value);
        if(head==null){
            head=node;
            tail=node;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    public void deletebyIndex(int index){
        if(index==0){
            tail.next=head.next;
            head=tail.next;

        }
        Node node=head;
        for (int i = 1; i < index; i++) {
            node=node.next;
        }
        node.next=node.next.next;

    }
    public void delete(int value) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.val == value) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == value) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
        System.out.println(value+" "+"Deleted");
    }
    public void display(){
        Node node =head;
        do {
            System.out.print(node.val+"->");
            node =node.next;
        }while (node!=head);
        System.out.println("Head");
    }

    public class Node{
       private int val;
       private Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
