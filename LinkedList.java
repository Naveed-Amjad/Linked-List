public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    LinkedList(){
        this.size = 0;
    }
    // insert element at first in list
    public void insertAtFirst(int val) {
        Node newNode = new Node(val,null);
        newNode.next = head;
        head = newNode;

        if (tail == null)
        {
            tail = head;
        }
        size += 1;
    }
    // insert at end method 1
    // this method takes O(1) time, much efficient
    public void insertAtEnd(int val) {
        Node newNode = new Node(val,null);
        if (tail == null) {
            insertAtFirst(val);
        }
        else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }
    // insert element at end of list method 2
    // this method takes O(n) time, slower than method 1
//    public void insertAtEnd(int val) {
//        Node newNode = new Node(val,null);
//        // when there is no element in list
//        if (head == null)
//            head = newNode;
//        // traverse till end of list
//        else{
//            Node currentNode = head;
//            while(currentNode.next != null) {
//                currentNode = currentNode.next;
//            }
//            currentNode.next = newNode;
//        }
//
//    }
    // insert at any given position in list
    public void inertAtPosition(int val,int position) {
        Node currentNode = head;
        Node prevNode = head;
        Node newNode = new Node(val,null);
        int index = 1;
        if(position == 1)
        {
            newNode.next = head;
            head = newNode;
        }
        else {
            while( index < position)
            {
                prevNode = currentNode;
                currentNode = currentNode.next;
                index++;
            }
            newNode.next = currentNode;
            prevNode.next = newNode;

        }
    }
    // display the elements of the list
    public void display() {
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.value + " --> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
    // methods to delete elements
    public void deleteFromStart() {
        if(head == null)
            System.out.println("List is Empty.");
        else {
            head = head.next;
        }
    }
    public void deleteFromEnd() {
        if (head == null)
            System.out.println("List is empty.");
        else {
            if (head.next == null)
                head = null;
            else {
                Node currentNode = head;
                Node prevNode = head;
                while(currentNode.next != null)
                {
                    prevNode = currentNode;
                    currentNode = currentNode.next;
                }
                prevNode.next = null;
            }

        }
    }
    public void deleteFromPosition(int position) {
        if (head.next == null)
            head = null;
        else {
            Node currentNode = head;
            Node prevNode = head;
            int index = 1;
            while(index < position) {
                prevNode = currentNode;
                currentNode = currentNode.next;
                index++;
            }
            prevNode.next = currentNode.next;
        }
    }






    // Node
    private class Node{
        private int value;
        private Node next;

//        public Node(int val){
//            this.value = val;
//        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}

// driver class
class test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.insertAtFirst(5);
//        list.insertAtFirst(9);
//        list.insertAtFirst(2);
//        list.display();
//        list.insertAtEnd(5);
//        list.insertAtEnd(6);
//        list.insertAtEnd(7);
//        list.insertAtFirst(4);
//        list.insertAtEnd(100);
//        list.display();
        //list.insertAtFirst(5);
       // list.inertAtPosition(7,1);
//        list.insertAtEnd(10);
//        list.insertAtEnd(2);
//        list.insertAtFirst(3);
//        list.inertAtPosition(99,3);
//        list.display();
//        list.insertAtEnd(5);
//        list.insertAtEnd(10);
//        list.insertAtEnd(15);
//        list.display();
//        list.deleteFromStart();
//        list.display();
//        list.deleteFromStart();
//        list.display();
//        list.deleteFromStart();
//        list.display();
//          list.insertAtEnd(5);
//          list.insertAtEnd(10);
//          list.insertAtEnd(15);
//          list.display();
//          list.deleteFromEnd();
//          list.display();
//        list.insertAtEnd(5);
//        list.insertAtEnd(10);
//        list.insertAtEnd(15);
//        list.insertAtEnd(20);
//        list.display();
//        list.deleteFromPosition(3);
//        list.display();


    }
}
