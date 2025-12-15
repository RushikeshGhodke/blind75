import java.util.Arrays;

class Stack {
    int maxSize = 10;
    int size = 0;
    int[] internalArray;

    public Stack() {
        internalArray = new int[maxSize+1];
    }

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.internalArray = new int[maxSize+1];
        Arrays.fill(this.internalArray, -1);

    }

    public boolean isEmpty() {
        if (size == 0) {
            System.out.println("Stack is empty.");
            return true;
        }
        return false;
    }

    public boolean isStackOverflow() {
        if (size == maxSize) {
            System.out.println("Stack Overflow!");
            return true;
        }
        return false;
    }

    public boolean push(int val) {
        if (this.isStackOverflow()) {
            System.out.println("Cannot add element into stack.");
            return false;
        }
        this.internalArray[size] = val;
        this.size++;
        return true;
    }

    public boolean pop() {
        if (isEmpty()) {
            return false;
        }
        this.internalArray[size] = -1;
        this.size--;
        return true;
    }

    public int size() {
        return size;
    }

    public void printStack() {
        System.out.print("[");
        for (int i = 0; i < this.size - 1; i++) {
            System.out.print(this.internalArray[i] + ", ");
        }
        System.out.print(this.internalArray[size - 1] + "]");
        System.out.println();
    }

}

public class StackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(1);
        stack.printStack();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.printStack();
        stack.pop();
        stack.printStack();
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}