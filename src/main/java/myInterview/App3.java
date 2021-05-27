package myInterview;

public class App3 {
//    напечатай последовательность чисел от 1 до н
//    если число делится на 3 напечатай "Fizz"
//    если число делится на 5 напечатай "Buzz"
//    если число делится на 3 и если число делится на 5 напечатай "Fizzbuzz"
    public static void main(String[] args) {
       fizzbuzz(15);
    }
    public static void fizzbuzz(int bound){
        for (int i = 1;i<=bound;i++) {
            if (i % 15 == 0) {
                System.out.println("Fizzbuzz");
                continue;}
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;}
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;}
            System.out.println(i);
        }
    }
}
