package AlgorithmQ2_BinarySearch;
import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {

    public static void main(String[] args) {
        // Input: Read in the list of words
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of words separated by spaces: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");

        // Logic: Sort the word list using Arrays
        Arrays.sort(words);

        // Input: Prompt the user to enter a word to search
        System.out.print("Enter a word to search: ");
        String searchWord = scanner.next();

        // Logic: Perform binary search
        boolean found = binarySearch(words, searchWord);

        // Output: Print the result
        if (found) {
            System.out.println("The word \"" + searchWord + "\" is found in the list.");
        } else {
            System.out.println("The word \"" + searchWord + "\" is not found in the list.");
        }
    }

    // Helper method to perform binary search
    private static boolean binarySearch(String[] words, String searchWord) {
        int left = 0;
        int right = words.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compareResult = searchWord.compareTo(words[mid]);

            if (compareResult == 0) {
                return true; // Word found
            } else if (compareResult < 0) {
                right = mid - 1; // Word may be in the left half
            } else {
                left = mid + 1; // Word may be in the right half
            }
        }

        return false; // Word not found
    }
}
