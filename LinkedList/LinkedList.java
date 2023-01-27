class Node {
  Node next;
  int data;
  
  Node (int data) {
    this.data = data;
  }
}


public class LinkedList {
  
  Node head;

  public void append(int data) {
    if(head == null) {
      head = new Node(data);
      return;
    }

    Node current = head;
    while(current.next != null) {
      current = current.next;
    }

    current.next = new Node(data);
  }

  public void prepend(int data) {

    Node newHead = new Node(data);
    newHead.next = head;
    head = newHead;

  }

  public void deleteWithValue(int data) {
    
    if(head == null) return;

    if(head.data == data) {
      head = head.next;
    }

    Node current = head;

    while(current.next != null) {
      if(current.next.data == data) {
        current.next = current.next.next;
      }
      current = current.next;
    }
  }

  public void display() {
    if(head == null) return;

    Node current = head;

    while(current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    } System.out.println();
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    for(int i = 1; i <= 10; i++) {
      list.append(i);
    }

    list.display();
    
  }

}