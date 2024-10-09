class PriorityQueue {
    int[] heap;
    int size;
    int capacity;

    PriorityQueue(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity + 1];
        this.size = 0;
    }

    void enqueue(int value, int priority) {
        if (size == capacity) {
            System.out.println("Priority Queue Overflow");
            return;
        }
        heap[++size] = value;
        int index = size;
        while (index > 1 && getPriority(index) > getPriority(parent(index))) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    int dequeue() {
        if (size == 0) {
            System.out.println("Priority Queue Underflow");
            return -1;
        }
        int value = heap[1];
        heap[1] = heap[size--];
        heapify(1);
        return value;
    }

    int getPriority(int index) {
        // Assuming priority is stored along with value in the heap array
        // Here, we're using a simple representation where higher value means higher priority
        return heap[index];
    }

    int parent(int index) {
        return index / 2;
    }

    void heapify(int index) {
        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);
        if (left <= size && getPriority(left) > getPriority(largest)) {
            largest = left;
        }
        if (right <= size && getPriority(right) > getPriority(largest)) {
            largest = right;
        }
        if (largest != index) {
            swap(index, largest);
            heapify(largest);
        }
    }

    int leftChild(int index) {
        return 2 * index;
    }

    int rightChild(int index) {
        return 2 * index + 1;
    }

    void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    void display() {
        System.out.print("Priority Queue = [");
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i]);
            if (i < size) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

class PriorityElement {
    int value;
    int priority;

    PriorityElement(int value, int priority) {
        this.value = value;
        this.priority = priority;
    }
}

public class pQ {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(10);
        priorityQueue.enqueue(3, 1);
        priorityQueue.enqueue(10, 3);
        priorityQueue.enqueue(5, 2);
        System.out.print("Dequeued element = ");
        System.out.println(priorityQueue.dequeue());
        priorityQueue.display();
    }
}
