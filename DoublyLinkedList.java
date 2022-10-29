public class DoublyLinkedList {

    private Node head;

    public void insertAtFirst(int val) {
        Node newNode = new Node(val,null,null);
        if (head == null)
        {
            newNode.next = head;
            head = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    // to insert at last
    public void insertAtLast(int val) {
        Node newNode = new Node(val,null,null);
        if (head == null) {
            newNode.next = head;
            head = newNode;
        }
        else {
            Node currentNode = head;
            while (currentNode.next != null)
            {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.prev = currentNode.next;
        }
    }
    // to insert element at any given position
    public void insertAtPosition(int val, int position)  {
        Node newNode = new Node(val,null, null);
        int index = 1;
        if (head == null){
            newNode.next = head;
            head = newNode;
        }
        else {
            Node currentNode = head;
            Node prevNode = head;
            while (index < position) {
                prevNode = currentNode;
                currentNode = currentNode.next;
                index++;
            }
            newNode.next = currentNode;
            currentNode.prev = newNode;
            prevNode.next = newNode;
            newNode.prev = prevNode;
        }
    }
    // delete methods
    public void deleteFromStart(){
        if (head == null) {
            System.out.println("List is empty.");
        }
        else {
            head = head.next;
            head.prev = null;
        }
    }
    // delete from end
    public void deleteFromEnd(){
        if (head == null){
            System.out.println("List is empty.");
        }
        else {
            if (head.next == null) {
                head = null;
            }
            else {
                Node currentNode = head;
                Node prevNode = head;
                while (currentNode.next != null){
                    prevNode = currentNode;
                    currentNode = currentNode.next;
                }
                prevNode.next = null;
            }
        }
    }
    //
    public void deleteFromPosition(int position) {
        if (head == null)
            System.out.println("List is empty.");
        else{
            if (head.next == null){
                head = null;
            }
            else {
                Node currentNode = head;
                Node prevNode = head;
                int index = 1;
                while(index < position){
                    prevNode = currentNode;
                    currentNode = currentNode.next;
                    index++;
                }
                prevNode.next = currentNode.next;
                currentNode.next.prev = prevNode;

            }

        }

    }

    public void display() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " --> ");
            currentNode = currentNode.next;
        }
        System.out.println(" null ");
    }

    // Node structure
    class Node {
        private int value;
        private Node next;
        private Node prev;

        Node(int val, Node next, Node prev) {
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }
}

// main class to test fnctions
class driver {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        //list.insertAtLast(5);
       //list.insertAtLast(10);
        //list.insertAtLast(15);
        //list.display();
//        list.insertAtPosition(5,1);
//        list.display();
//        list.insertAtLast(10);
//        list.display();
//        list.insertAtLast(15);
//        list.display();
//        list.deleteFromPosition(2);
//        list.display();








    }
}