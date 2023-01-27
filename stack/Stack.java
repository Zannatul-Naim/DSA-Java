package stack;

class Node {
    
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Stack {
    
    private Node top;

    public Stack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        return top.data;
    }

    public void push(int data) {
        if(top == null) top = new Node(data);
        else {
            Node temp = new Node(data);
            temp.next = top;

            top = temp;
        }
    }

    public void pop() {
        
        if(top == null) return;
        
        top = top.next;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(54);
        stack.push(78);

        System.out.println("top element: " + stack.peek());
    }
    
}
