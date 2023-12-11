package AlgorithmQ4_BubbleSort;
import java.util.Scanner;

public class bubbleSort {

    public static void bubbleSorting(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Input: Read in the list of integers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of integers separated by spaces: ");
        String input = scanner.nextLine();
        String[] strNumbers = input.split("\\s+");

        // Convert string array to int array
        int[] numbers = new int[strNumbers.length];
        for (int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        // Logic: Use Bubble Sort to sort the list of integers
        bubbleSorting(numbers);

        // Output: Print the sorted list
        System.out.print("Sorted List: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
