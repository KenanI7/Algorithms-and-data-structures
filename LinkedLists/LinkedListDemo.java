public class LinkedListDemo {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

        linkedList.insertFirst(15);
        linkedList.insertFirst(3);
        linkedList.insertFirst(7);
        linkedList.insertFirst(10);
        linkedList.insertFirst(2);
        linkedList.insertFirst(7);
        linkedList.insertFirst(3);
        linkedList.insertFirst(15);
        linkedList.insertFirst(10);

        System.out.println("Original List:");
        linkedList.displayList();

        int duplicateCount = linkedList.countDuplicates();
        System.out.println("Number of Duplicates: " + duplicateCount);

        linkedList.removeDuplicates();
        System.out.println("List after removing duplicates:");
        linkedList.displayList();

        linkedList.swapNodes(15, 3);
        System.out.println("List after swapping nodes:");
        linkedList.displayList();

        linkedList.sortList();
        System.out.println("Sorted List:");
        linkedList.displayList();
    }
}

