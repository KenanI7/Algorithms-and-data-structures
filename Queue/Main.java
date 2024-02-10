public class Main {
    public static void main(String[] args) {

        // Create a priority queue with the size 5
        PriorityQueue priorityQueue = new PriorityQueue(5);

        // Inserting elements in the queue
        priorityQueue.insert(7);
        priorityQueue.insert(9);
        priorityQueue.insert(10);
        priorityQueue.insert(8);
        priorityQueue.insert(6);


        // Display the elements of the priority queue
        priorityQueue.display();

        // Remove and display the element with the highest priority
        int removed1 = priorityQueue.remove();
        System.out.println("First removed element: " + removed1);
        int removed2 = priorityQueue.remove();
        System.out.println("Second removed element: " + removed2);

        // Display the updated priority queue
        priorityQueue.display();
    }
}

