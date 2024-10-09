class MaxHeap {
    int[] heap;
    int size;
    int capacity;

    MaxHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity + 1];
        this.size = 0;
    }

    void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap Overflow");
            return;
        }
        heap[++size] = value;
        int index = size;
        while (index > 1 && heap[index] > heap[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    int extractMax() {
        if (size == 0) {
            System.out.println("Heap Underflow");
            return -1;
        }
        int max = heap[1];
        heap[1] = heap[size--];
        heapify(1);
        return max;
    }

    void heapify(int index) {
        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);
        if (left <= size && heap[left] > heap[largest]) {
            largest = left;
        }
        if (right <= size && heap[right] > heap[largest]) {
            largest = right;
        }
        if (largest != index) {
            swap(index, largest);
            heapify(largest);
        }
    }

    int parent(int index) {
        return index / 2;
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
        System.out.print("Max-Heap = [");
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i]);
            if (i < size) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

public class Heap2 {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(12);
        maxHeap.insert(7);
        maxHeap.insert(15);
        maxHeap.insert(5);
        System.out.print("Extracted Max = ");
        System.out.println(maxHeap.extractMax());
        maxHeap.display();
    }
}