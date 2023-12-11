package AlgorithmQ7_PrimeNumbers;

public class primeNumbersInRange {

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

    public static void main(String[] args) {
        // Define the range
        int lowerLimit = 0;
        int upperLimit = 1000;

        // Output: Print prime numbers in the range
        System.out.println("Prime numbers in the range of " + lowerLimit + " to " + upperLimit + ":");
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
