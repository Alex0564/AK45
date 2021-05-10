package lesson15ExceptionsStatics;

public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int[]x = {1,2};

        System.out.println("Before try/catch");
        try {
            System.out.println("In the try/catch");
            int c = a/b;
            x[7] = 9;
            System.out.println("Mistake isn't here");
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
//            throw e;
        } finally {
            System.out.println("in the finally");
        }
//        catch (Exception e){
//            System.out.println("All exception block");
//        }

        System.out.println("After try/catch");
    }
}
