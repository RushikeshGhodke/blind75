import java.util.Arrays;

class Queue {
    int maxSize = 10;
    int front = -1;
    int rear = -1;
    int count = 0;
    int[] internalArray;

    public Queue() {
        internalArray = new int[maxSize + 1];
    }

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.internalArray = new int[maxSize + 1];
        Arrays.fill(this.internalArray, -1);
    }

    public void enqueue(int val) {
        if (count == 0) {
            front = 0;
            rear = 0;
            internalArray[rear] = val;
            count++;
        } else {
            rear = (rear + 1) % maxSize;
            internalArray[rear] = val;
            count++;
        }
    }

    public void dequeue() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return;
        }
        if (count == 1) {
            front = rear = -1;
        }
        front = (front + 1) % maxSize;
        count--;
    }

    public int size() {
        return count;
    }

    public void printQueue() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return;
        }

        int index = front;
        System.out.print("Queue: ");
        for (int i = 0; i < count; i++) {
            System.out.print(internalArray[index] + " ");
            index = (index + 1) % maxSize;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.printQueue(); 

        q.dequeue();
        q.printQueue(); 

        q.enqueue(60);
        q.printQueue(); 

        q.dequeue();
        q.printQueue(); 
    }

}
