package AlgorithmQ5_MergeSort;
import java.util.Arrays;
import java.util.Scanner;

public class mergeSortStrings {

    public static void mergeSort(String[] arr, int lo, int hi) {
        if (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            // Recursively sort the two halves
            mergeSort(arr, lo, mid);
            mergeSort(arr, mid + 1, hi);

            // Merge the sorted halves
            merge(arr, lo, mid, hi);
        }
    }

    private static void merge(String[] arr, int lo, int mid, int hi) {
        int n1 = mid - lo + 1;
        int n2 = hi - mid;

        // Create temporary arrays
        String[] left = new String[n1];
        String[] right = new String[n2];

        // Copy data to temporary arrays left[] and right[]
        System.arraycopy(arr, lo, left, 0, n1);
        System.arraycopy(arr, mid + 1, right, 0, n2);

        // Merge the temporary arrays back into arr[lo, hi)
        int i = 0, j = 0, k = lo;

        while (i < n1 && j < n2) {
            if (left[i].compareTo(right[j]) <= 0) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of left[], if there are any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy the remaining elements of right[], if there are any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        // Input: Array of Strings
        String[] arr = {"banana", "apple", "orange", "grape", "pineapple"};
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Logic: Use Merge Sort to sort the array of Strings
        mergeSort(arr, 0, arr.length - 1);

        // Output: Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
