// File: KenanImamovicMergesort.java

import java.util.Arrays;

public class KenanImamovicMergesort {

    public static void main(String[] args) {
        // Example input: random numbers
        int[] input = {5, 2, 8, 1, 7, 4, 6, 3};
        
        System.out.println("Original array: " + Arrays.toString(input));
        
        evenOddMergeSort(input, 0, input.length - 1);
        
        System.out.println("Sorted array with even and odd values separated: " + Arrays.toString(input));
    }

    private static void evenOddMergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            
            evenOddMergeSort(arr, low, mid);
            evenOddMergeSort(arr, mid + 1, high);
            
            merge(arr, low, mid, high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temporary arrays leftArr[] and rightArr[]
        for (int i = 0; i < n1; ++i)
            leftArr[i] = arr[low + i];
        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = low;

        // Merge the temporary arrays back into arr[low..high]
        while (i < n1 && j < n2) {
            if (rightArr[j] % 2 == 0) { // If right element is even
                arr[k] = rightArr[j];
                j++;
            } else { // If right element is odd
                arr[k] = leftArr[i];
                i++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
