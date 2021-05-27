package lesson15op;

public class App {
    public static void main(String[] args){
//        данные не правильные, делить на 0 нельзя!
        int a = 5;
        int b = 0;
        System.out.println("Before try/catch");
        try {
            System.out.println("In the try/catch");
            int c = a/b;
            System.out.println("After exception");
        } catch (ArithmeticException e){
            System.out.println("In the catch block");
        }
        System.out.println("After try/catch");




        int a2 = 5;
        int b2 = 1;
        int []x = {1,2};
        System.out.println("Before try/catch");
        try {
            System.out.println("In the try/catch");
            int c1 = a2/b2;
            x[7]=9;
            System.out.println("After exception");
        } catch (ArithmeticException e2){
            System.out.println("In the catch block");
        }catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("In the second catch block");
        }
        System.out.println("After try/catch");
    }
}
