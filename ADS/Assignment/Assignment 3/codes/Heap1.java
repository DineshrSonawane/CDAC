class MinHeap {
    int[] heap;
    int size;
    int capacity;

    MinHeap(int capacity) {
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
        while (index > 1 && heap[index] < heap[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    int extractMin() {
        if (size == 0) {
            System.out.println("Heap Underflow");
            return -1;
        }
        int min = heap[1];
        heap[1] = heap[size--];
        heapify(1);
        return min;
    }

    void heapify(int index) {
        int smallest = index;
        int left = leftChild(index);
        int right = rightChild(index);
        if (left <= size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right <= size && heap[right] < heap[smallest]) {
            smallest = right;
        }
        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
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
        System.out.print("Min-Heap = [");
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i]);
            if (i < size) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

public class Heap1 {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(10);
        minHeap.insert(15);
        minHeap.insert(20);
        minHeap.insert(17);
        System.out.print("Extracted Min = ");
        System.out.println(minHeap.extractMin());
        minHeap.display();
    }
}
