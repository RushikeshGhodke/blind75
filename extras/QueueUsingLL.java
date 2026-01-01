class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class QueueUsingLL {

    Node front;
    Node rear;
    int count;

    public QueueUsingLL() {
        front = null;
        rear = null;
        count = 0;

    }

    public void enqueue (int val) {
        Node newNode = new Node(val);

        if (front == null) {
            front = rear = newNode;
            count++;
        }

        rear.next = newNode;
        rear = rear.next;
        count++;
    }

    public void dequeue () {
        if (front == null) {
            rear = null;
        }

        front = front.next;
        count--;
    }

    public void printQueue () {
        Node temp = front;

        System.out.print("[ ");
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.printQueue();
        q.dequeue();
        q.printQueue();
    }
}
