class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class StackUsingLL {
    Node top = null;

    public void push (int val) {
        Node newNode = new Node(val);

        if (top == null) {
            top = newNode;
            return;
        }

        newNode.next = top;
        top = newNode;
    }

    public void pop () {
        if (top == null) {
            System.out.println("Stack is Empty.");
        }
        
        top = top.next;
    }

    public int peak () {
        return top != null ? top.val : -1;
    }

    public void printStack () {
        Node tempNode = top;

        System.out.print("[ ");
        while (tempNode != null) {
            System.out.print(tempNode.val +  " ");
            tempNode = tempNode.next;
        }
        System.out.print("]");

        System.out.println();

    }

    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();

        stack.push(1);
        stack.push(2);
        stack.printStack();
        stack.push(5);
        stack.push(6);
        stack.printStack();
        stack.pop();
        stack.push(2);
        System.out.println("Peek: " + stack.peak());
        stack.printStack();
        stack.pop();

    }
}
