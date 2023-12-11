package AlgorithmQ3_InsertionSort;

import java.util.Scanner;

public class insertionSortStrings {
    public static void insertionSort(String[] words) {
        int n = words.length;
        for (int i = 1; i < n; ++i) {
            String key = words[i];
            int j = i - 1;

            while (j >= 0 && words[j].compareTo(key) > 0) {
                words[j + 1] = words[j];
                j = j - 1;
            }
            words[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read a list of words
        System.out.print("Enter a list of words separated by spaces: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");

        // Logic: Use Insertion Sort to sort the list of words
        insertionSort(words);

        // Output: Print the sorted list
        System.out.print("Sorted List: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
