package linkedList;

public class DLL {
    private Node head;

    public void insertFirst(int val){
        Node node  = new Node(val);
        node.next=head;
        node.prev=null;
        if (head!=null){
            head.prev=node;
        }
        head=node;
    }
    public void insertLast(int val){

        Node node =new Node(val);
        if (head == null) {
            node.prev=null;
            head=node;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node last = temp;

        node.next=null;
        last.next=node;
        node.prev=last;

    }
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        Node temp=head;
        for (int i=1;i<index;i++){
            temp=temp.next;
        }

        Node node =new Node(val,temp.next);
        temp.next=node;
    }
    public void insertAfterValue(int after,int val){
        Node p=find(after);
        if(p==null){
            System.out.println("Does not exist");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        node.prev=p;
        p.next=node;
        if(node.next!=null){
            node.next.prev=node;
        }

    }
    public Node find(int value){
        Node node =head;
        while(node!=null){
            if(node.value==value){
                return node;
            }else{
                node=node.next;
            }
        }
        return null;
    }
    public void display(){
        Node node =head;
//        Node last=null;
        while (node != null){
            System.out.print(node.value+"->");
//            last=node;
            node=node.next;
        }
        System.out.println("END");
//        System.out.println("Print in reverse");
//        while (last!=null){
//            System.out.print(last.value+"->");
//            last=last.prev;
//        }
//        System.out.println("Start");
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
