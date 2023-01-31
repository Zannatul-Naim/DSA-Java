
class Node {

    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}


public class CircularLinkedList {

    public Node head = null, tail = null;
    int size = 0;

    public void addBegin(int data) {
        
        Node newNode = new Node(data);

        if(head == null) {

            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {

            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    public void append(int data) {

        Node newNode = new Node(data);

        if(head == null) {

            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {

            tail.next = newNode;
            tail = tail.next;
            tail.next = head;
        }
        size++;
    }

    public void insertAtNth(int data, int n) {

        if(n == 0) {
            addBegin(data);
        } else if(n == size+1) {
            append(data);
        } else if(n >= 0 && n <= size) {
            Node curr = head;
            Node prev = curr;

            int x = 0;

            while(x != n) {
                x++;
                prev = curr;
                curr = curr.next;
            }

            Node newNode = new Node(data);
            prev.next = newNode;
            newNode.next = curr;
        } else {
            System.out.println("Invalid position!");
        }
    }


    public void deleteFirst() {

        if(head == null) {
            System.out.println("Empty list!");
            return;
        }

        if(head != tail) {
            head = head.next;
            tail.next = head;
        } else {
            head = tail = null;
        }
        size -= 1;
    }

    public void deleteLast() {

        if(head == null) {

            System.out.println("Empty List!");
            return;
        }

        if(head != tail) {

            Node curr = head;

            while(curr.next != tail) curr = curr.next;

            tail = curr;
            tail.next = head;
        } else {

            head = tail = null;
        }

        size -= 1;

    }

    public void deleteAfterNth(int n) {

        if(n == 0) {
            deleteFirst();

        } else if(n == size) {
            deleteLast();

        } else if(n >= 0 && n <= size) {
            
            Node curr = head;
            Node prev = curr;

            int x = 0;

            while(x != n) {
                x++;
                prev = curr;
                curr = curr.next;
            }

            prev.next = curr.next;

        } else {
            System.out.println("Invalid position!");
        }
    }

    int size() {

        return size;
    }

    public void display() {

        if(head == null) {
            System.out.println("Empty List!");
            return;
        }

        Node current = head;
        System.out.print(current.data + " ");
        current = current.next;

        while(current != head) {
            System.out.print(current.data + " ");
            current = current.next;
        } System.out.println();
    }

    public static void main(String[] args) {
        
        CircularLinkedList clist = new CircularLinkedList();

        // adding at the begin of the list.
        for(int i = 5; i >= 0; i--) {
            clist.addBegin(i);
        }

        clist.display();

        // adding at the end of the list.

        for(int i = 6; i <= 10; i++) {
            clist.append(i);
        }
        clist.display();

        clist.insertAtNth(100, 5);
        clist.insertAtNth(1000, 11);
        clist.insertAtNth(10000, 0);

        clist.display();

        clist.deleteFirst();
        clist.display();
        // System.out.println(clist.size());

        clist.deleteLast();
        clist.display();

        clist.deleteAfterNth(clist.size());
        clist.display();
        clist.deleteAfterNth(5);
        clist.display();

    }
}
