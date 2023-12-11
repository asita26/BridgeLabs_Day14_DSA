package AlgorithmQ8_Prime_AnagramAndPanlindrome;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class primeAnagramPalindrome {

        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }

        public static boolean isAnagram(int num1, int num2) {
            char[] arr1 = Integer.toString(num1).toCharArray();
            char[] arr2 = Integer.toString(num2).toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        }

        public static boolean isPalindrome(int number) {
            int original = number;
            int reversed = 0;

            while (number > 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }

            return original == reversed;
        }

        public static void main(String[] args) {
            // Define the range
            int lowerLimit = 0;
            int upperLimit = 1000;

            // Output: Print prime numbers that are both Anagram and Palindrome in the range
            System.out.println("Prime numbers that are both Anagram and Palindrome in the range of "
                    + lowerLimit + " to " + upperLimit + ":");

            List<Integer> primes = new ArrayList<>();

            for (int i = lowerLimit; i <= upperLimit; i++) {
                if (isPrime(i)) {
                    primes.add(i);
                }
            }

            for (int i = 0; i < primes.size(); i++) {
                for (int j = i + 1; j < primes.size(); j++) {
                    int prime1 = primes.get(i);
                    int prime2 = primes.get(j);

                    if (isAnagram(prime1, prime2) && isPalindrome(prime1)) {
                        System.out.println("Anagram and Palindrome Pair: Prime 1: " + prime1 + ", Prime 2: " + prime2);
                    }
                }
            }
        }
    }
