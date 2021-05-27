package myInterview;

public class App {
    public static void main(String[] args) {
//        получить остаток от деления двух чисел
//        System.out.println(getReminder(0,0));
        System.out.println(getReminder2(10, 0));
    }
    public static int getReminder (int a, int b) {
        if(b==0){
            System.out.println("wrong number!");
            return 0;}
        while (a >= b) {a = a - b;}
        return a;
    }
    public static int getReminder2 (int a, int b){
        return a-(a/b)*b;
    }
}
