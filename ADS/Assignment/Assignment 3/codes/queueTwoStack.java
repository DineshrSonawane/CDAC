class Stack {
    int max = 100;
    int[] array = new int[max];
    int top = -1;

    void push(int element) {
        if (top < max - 1) {
            array[++top] = element;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    int pop() {
        if (top >= 0) {
            return array[top--];
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    boolean isEmpty() {
        return top == -1;
    }
}

class Queue {
    Stack stack1;
    Stack stack2;

    Queue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    void enqueue(int element) {
        stack1.push(element);
    }

    int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    void display() {
        System.out.print("Queue = [");
        if (!stack2.isEmpty()) {
            int[] temp = new int[stack2.top + 1];
            int index = stack2.top;
            while (!stack2.isEmpty()) {
                temp[index--] = stack2.pop();
            }
            for (int i = 0; i < temp.length; i++) {
                System.out.print(temp[i]);
                if (i < temp.length - 1) {
                    System.out.print(", ");
                }
            }
        } else {
            int[] temp = new int[stack1.top + 1];
            int index = stack1.top;
            while (!stack1.isEmpty()) {
                temp[index--] = stack1.pop();
            }
            for (int i = 0; i < temp.length; i++) {
                System.out.print(temp[i]);
                if (i < temp.length - 1) {
                    System.out.print(", ");
                }
                stack1.push(temp[i]);
            }
        }
        System.out.println("]");
    }
}

public class queueTwoStack {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue(7);
        System.out.print("Dequeued element = ");
        System.out.println(queue.dequeue());
        queue.display();
    }
}
