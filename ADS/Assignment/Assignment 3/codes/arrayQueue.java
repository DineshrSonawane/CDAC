class Queue {
    int max = 100;
    int[] array = new int[max];
    int front = 0;
    int rear = -1;
    int size = 0;

    void enqueue(int element) {
        if (size < max) {
            array[++rear] = element;
            size++;
        } else {
            System.out.println("Queue Overflow");
        }
    }

    int dequeue() {
        if (size > 0) {
            int temp = array[front];
            for (int i = 0; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
            rear--;
            return temp;
        } else {
            System.out.println("Queue Underflow");
            return -1;
        }
    }

    void display() {
        System.out.print("Queue = [");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

public class arrayQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(10);
        System.out.print("Dequeued element = ");
        System.out.println(queue.dequeue());
        queue.display();
    }
}
