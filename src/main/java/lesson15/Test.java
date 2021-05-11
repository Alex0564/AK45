
package lesson15;

public class Test {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
         System.out.println("Before try/catch");
         try {
              System.out.println("In the try catch"); //Потонцеально опасный код посадить в сенд бокс, ложим в блок try, и если он сломается я хочу это место catch-поймать
              int c = a / b;
              System.out.println("After exception");
         } catch (ArithmeticException e) {
                System.out.println("In the catch block");




            }
        System.out.println("After try/catch");

    }

}
