public class PriorityQueue {
    private int[] queue;
    private int size;
    private int capacity;

    public PriorityQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void insert(int element) {
        if (isFull()) {
            System.out.println("Priority Queue is full. Cannot insert.");
            return;
        }

        int index = size;

        while (index > 0 && element > queue[index - 1]) {
            queue[index] = queue[index - 1];
            index--;
        }

        queue[index] = element;
        size++;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Priority Queue is empty. Cannot remove.");
            return -1;
        }

        int removed = queue[0]; // Get the largest element from the beginning of the array

        // Shift elements to the left to remove the element at the front of the queue (highest priority).
        for (int i = 0; i < size - 1; i++) {
            queue[i] = queue[i + 1];
        }

        size--;

        return removed;
    }

    public void display() {
        System.out.print("Elements in the priority queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

