package test15;

public class App {

    public static void main(String[] args) {
        int a=5;
        int b=0;
        int c=a/b;

//        Потоц опасный код ложим в box trycatch
        try{
            int c=a/b;

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("After try/cath");
    }
}
