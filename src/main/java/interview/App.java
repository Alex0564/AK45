package interview;

public class App {
    public static void main(String[] args) {
        System.out.println(getRemainder1(100,30));
        System.out.println(getRemainder2(100,40));

    }
    public static int getRemainder1(int a, int b){
        while (a>=b){
            a=a-b;
        }
        return a;
    }

    public static int getRemainder2 (int a, int b){
        return a-((int)a/b)*b;
    }
}
