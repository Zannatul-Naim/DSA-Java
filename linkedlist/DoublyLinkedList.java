class Node {
    int data;
    Node next, prev;

    public Node(int data) {

        this.data = data;
        this.next = this.prev = null;
    }

    public Node (Node prev, int data, Node next) {
        
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

public class DoublyLinkedList {

    private Node head, tail;
    private int size;

    public DoublyLinkedList() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        if(head == null) return false;
        else return true;
    }

    public void addFront(int data) {

        if(head == null) {
            head = new Node(data);
            tail = head;
        } else {
            Node temp = new Node(null, data, head);
            
            head.prev = temp;
            head = temp;
        }

        size += 1;
    }

    public void addLast(int data) {

        if(head == null) {
            head = new Node(data);
            tail = head;
        } else {
            tail.next = new Node(tail, data, null);
            tail = tail.next;
        }

        size += 1;
    }

    void print() {

        Node current = head;

        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        } System.out.println();
    }

    void printReverse() {
        
        Node temp = tail;
        
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }System.out.println();
    }

    void reverseList() {

        Node prev = null;
        Node next = null;
        Node curr = head;

        while(curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        
        DoublyLinkedList dList = new DoublyLinkedList();
        
        dList.addFront(45);
        dList.addFront(50);
        dList.addFront(78);
        dList.addFront(90);

        System.out.println("Size: " + dList.size());

        dList.print();

        // add last element
        dList.addLast(100);
        dList.addLast(110);

        System.out.println("Size: " + dList.size());

        dList.print();

        // printing the list in reverse order
        dList.printReverse();

        dList.reverseList();
        dList.print();


    }

}
