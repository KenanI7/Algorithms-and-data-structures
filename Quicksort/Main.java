import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] characters = {'c', 'h', 'e', 's', 't', 'q', 'u', 'i'};

        System.out.println("Input: " + Arrays.toString(characters));

        KenanImamovicQuicksort.quicksort(characters);

        System.out.println("Output: " + Arrays.toString(characters));
    }
}
