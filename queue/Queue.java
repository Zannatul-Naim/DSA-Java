
class Node {
    
    Node next;
    int data;

    Node (int data) {
        this.data = data;
        this.next = null;
    }
}

public class Queue {
    
    private Node head, tail;
        
    public boolean isEmpty() {

        if(head == null) return false;
        else return true;
    }

    public int peek() {
        return head.data;
    }

    public void add(int data) {
        
        Node node = new Node(data);

        if(tail != null) {
            tail.next = node;
        } 
        tail = node;

        if(head == null) head = node;
    }

    public int remove() {

        if(head == null) return 0;

        int data = head.data;
        head = head.next;

        if(head == null) tail = null;

        return data;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.add(125);
        queue.add(23);
        queue.add(123);

        System.out.println("Romoved: " + queue.remove());
    }
}
