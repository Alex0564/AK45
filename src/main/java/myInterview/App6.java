package myInterview;

public class App6 {
    public static void main(String[] args) {
//        вывести все простые числа от 1 до числа н
//        System.out.println(isPrime(100));
        printPrimes(100);
    }

    private static void printPrimes(int bound) {
        for (int i = 2; i <= bound; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {return false;}
        }
        return true;
    }
}
