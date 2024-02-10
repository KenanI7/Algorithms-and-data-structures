class MyLinkedList {
    private Node first;

    public MyLinkedList() {
        first = null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
    }

    public void displayList() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int countDuplicates() {
        int count = 0;
        Node current = first;

        while (current != null) {
            Node runner = current.next;
            while (runner != null) {
                if (current.data == runner.data) {
                    count++;
                    break;
                }
                runner = runner.next;
            }
            current = current.next;
        }

        return count;
    }

    public void removeDuplicates() {
        Node current = first;

        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (current.data == runner.next.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public void swapNodes(int data1, int data2) {
        if (data1 == data2) {
            return;
        }

        Node prev1 = null, curr1 = first;
        while (curr1 != null && curr1.data != data1) {
            prev1 = curr1;
            curr1 = curr1.next;
        }

        Node prev2 = null, curr2 = first;
        while (curr2 != null && curr2.data != data2) {
            prev2 = curr2;
            curr2 = curr2.next;
        }

        if (curr1 == null || curr2 == null) {
            return;
        }

        if (prev1 != null) {
            prev1.next = curr2;
        } else {
            first = curr2;
        }

        if (prev2 != null) {
            prev2.next = curr1;
        } else {
            first = curr1;
        }

        Node temp = curr1.next;
        curr1.next = curr2.next;
        curr2.next = temp;

        System.out.println("Swapped nodes with data " + data1 + " and " + data2);
    }

    public void sortList() {
        boolean swapped;
        Node last = null;

        do {
            swapped = false;
            Node current = first;
            Node next = first.next;

            while (next != last) {
                if (current.data > next.data) {
                    int temp = current.data;
                    current.data = next.data;
                    next.data = temp;
                    swapped = true;
                }
                current = next;
                next = next.next;
            }
            last = current;
        } while (swapped);
    }
}
