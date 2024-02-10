public class MStack {
    private int[] array;  // create array to hold data
    private int[] top;    // array to keep the top value
    private int stackSize; // size of stack

    public MStack(int capacity) {
        array = new int[capacity]; // sreate array capacity
        top = new int[4]; // initialize the top for all stacks
        stackSize = capacity / 4; // calculate the size of stacks

        // initialize top indices for each stack, they start at -1 wich is empty
        for (int i = 0; i < 4; i++) {
            top[i] = i * stackSize - 1;
        }
    }

    // check if a stack is full
    public boolean isFull(int stackNum) {
        return top[stackNum] == (stackNum + 1) * stackSize - 1;
    }

    // check if a stack is empty
    public boolean isEmpty(int stackNum) {
        return top[stackNum] == stackNum * stackSize - 1;
    }

    // push an element onto a specific stack
    public void push(int stackNum, int value) {
        if (!isFull(stackNum)) {
            top[stackNum]++; // mve the top index up
            array[top[stackNum]] = value; // put the value in the stack
            // print a message for push
            System.out.println("Pushed " + value + " to Stack " + (stackNum + 1));
        } else {
            // print a message that the staack is full
            System.out.println("Stack " + (stackNum + 1) + " is full. Cannot push " + value);
        }
    }

    // pop an element from a stack
    public int pop(int stackNum) {
        if (!isEmpty(stackNum)) {
            int value = array[top[stackNum]]; // get the value from the stack
            top[stackNum]--; // move the top index down
            // print a message for pop
            System.out.println("Popped " + value + " from Stack " + (stackNum + 1));
            return value;
        } else {
            // print a message for stack underflow, I thought that was needed as well
            System.out.println("Stack " + (stackNum + 1) + " is empty. Cannot pop.");
            return -1;
        }
    }

    // displey the elements of all four stacks
    public void display() {
        System.out.println("Stack 1: ");
        for (int i = 0; i <= top[0]; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Stack 2: ");
        for (int i = stackSize; i <= top[1]; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Stack 3: ");
        for (int i = 2 * stackSize; i <= top[2]; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Stack 4: ");
        for (int i = 3 * stackSize; i <= top[3]; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

