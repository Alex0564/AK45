package lesson7a;

public class App {
    public static int h1(int a, int b, int c){
        a = b+c;
        System.out.println("========");
        return b*c;
    }
    public static int h2(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {

        int x = 0;
        int ent = h1(x,5,7);
        System.out.println(x);
        System.out.println(ent);
        System.out.println(h2(6,7));


    }
}
