class MinHeap {
    int[] heap;
    int size;
    int capacity;

    MinHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity + 1];
        this.size = 0;
    }

    void insert(int num) {
        if (size == capacity) {
            return;
        }
        heap[++size] = num;
        int index = size;
        while (index > 1 && heap[index] < heap[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    void deleteMin() {
        if (size == 0) {
            return;
        }
        heap[1] = heap[size--];
        heapify(1);
    }

    int peek() {
        return heap[1];
    }

    int parent(int index) {
        return index / 2;
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
}

class KthLargest {
    MinHeap minHeap;
    int k;

    KthLargest(int k) {
        this.k = k;
        this.minHeap = new MinHeap(k);
    }

    void add(int num) {
        if (minHeap.size < k) {
            minHeap.insert(num);
        } else if (num > minHeap.peek()) {
            minHeap.deleteMin();
            minHeap.insert(num);
        }
    }

    int getKthLargest() {
        return minHeap.peek();
    }
}

public class kthHeap {
    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(3);
        int[] stream = {3, 10, 5, 20, 15};
        for (int num : stream) {
            kthLargest.add(num);
        }
        System.out.println("Kth Largest: " + kthLargest.getKthLargest());
    }
}
