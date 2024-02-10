public class Kenan_Imamovic_Hash {

    public static void main(String[] args) {
        int[] inputArray = {2, 0, 2, 1, 4, 3, 1, 0};
        int[] result = findLargestConsSubarray(inputArray);

        System.out.print("INPUT: {");
        for (int num : inputArray) {
            System.out.print(num + ", ");
        }
        System.out.println("}");

        System.out.print("OUTPUT: {");
        for (int num : result) {
            System.out.print(num + ", ");
        }
        System.out.println("}");
    }

    public static int[] findLargestConsSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int maxLength = 0;
        int start = 0;
        int end = 0;
        int currentStart = 0;

        boolean[] seen = new boolean[256]; // Assuming the range of numbers is within 0 to 255

        for (int i = 0; i < nums.length; i++) {
            if (seen[nums[i]]) {
                // Duplicate found, remove elements from the set until the duplicate is removed
                while (nums[currentStart] != nums[i]) {
                    seen[nums[currentStart]] = false;
                    currentStart++;
                }
                currentStart++;
            } else {
                seen[nums[i]] = true;
                if (i - currentStart > maxLength) {
                    maxLength = i - currentStart;
                    start = currentStart;
                    end = i;
                }
            }
        }

        // Copy the result subarray
        int[] result = new int[maxLength + 1];
        for (int i = start; i <= end; i++) {
            result[i - start] = nums[i];
        }

        return result;
    }
}
