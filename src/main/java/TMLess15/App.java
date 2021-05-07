package TMLess15;

public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int[]x = {1,2};
        System.out.println("Befor try/catch");
        try {
            System.out.println("In the try/catch");
            int c = a / b;
            x[1] = 9;
            System.out.println("After exception");
        } catch (ArithmeticException e){
            System.out.println("in the catch block");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("In the second exception block");
//            throw e;
        } catch (Exception e){
            System.out.println("All exception block");
        } finally {
            System.out.println("in the finaly");
        }
        System.out.println("After try/catch");
    }
}
