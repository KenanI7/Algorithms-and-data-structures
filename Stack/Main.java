public class Main {
    public static void main(String[] args) {
        MStack MStack = new MStack(20);

        // pushing elements to the first stack
        MStack.push(0, 10);
        MStack.push(0, 20);
        MStack.push(0, 30);
        MStack.push(0, 40);
        MStack.push(0, 50);
        MStack.push(0, 55);  // push one too many elements to prompt overflow            

        // pushing elements to the second stack
        MStack.push(1, 60);
        MStack.push(1, 70);
        MStack.push(1, 80);
        MStack.push(1, 90);
        MStack.push(1, 100);

        // pushing elements to the third stack
        MStack.push(2, 110);
        MStack.push(2, 120);
        MStack.push(2, 130);
        MStack.push(2, 140);
        MStack.push(2, 150);

        // pushing elements to the fourth stack
        MStack.push(3, 160);
        MStack.push(3, 170);
        MStack.push(3, 180);
        MStack.push(3, 190);
        MStack.push(3, 200);

        // display the values of all four stacks
        MStack.display();

        // pop an element from the first stack and display
        MStack.pop(0);
        MStack.display();

        // same here
        MStack.pop(1);
        MStack.display();

        //  same here
        MStack.pop(2);
        MStack.display();

        // same here
        MStack.pop(3);
        MStack.display();
    }
}



// There are two files because I had problems when put in one, honestly I do not know why
// Also all stacks are full because why not I guess