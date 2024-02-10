
public class KenanImamovicQuicksort {
    public static void quicksort(char[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        quicksortHelper(arr, 0, arr.length - 1);
    }

    private static void quicksortHelper(char[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quicksortHelper(arr, low, pivotIndex - 1);
            quicksortHelper(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(char[] arr, int low, int high) {
        int pivotIndex = calculatePivotIndex(arr, low, high);
        char pivot = arr[pivotIndex];

        int floorPivotIndex = floorFunction(pivotIndex);

        swap(arr, floorPivotIndex, high);

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);

        return i + 1;
    }

    private static int calculatePivotIndex(char[] arr, int low, int high) {
        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum += (int) arr[i];
        }
        int pivotIndex = sum / (high - low + 1);
        return pivotIndex % (high - low + 1) + low;
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int floorFunction(int value) {
        // Round down to the nearest integer
        return (int) Math.floor(value);
    }
}
