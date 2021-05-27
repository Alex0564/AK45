package interview;

public class App2 {
    public static void main(String[] args) {
        fizzbuzz(50);
    }
    public static void fizzbuzz(int bound){
        for (int i = 1; i<=bound; i++){
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
                continue;
            }
            if (i%3==0){
                System.out.println("Fizz");
                continue;
            }
            if (i%5==0){
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }
}
