package test2;

public class Test {
    public static void main(String[] args) {

        hello("Denis");
        lenght(5);
        lenght(15);

        summ(1, 1, 3);

        int xx = three(10, 11, 12);
        System.out.println(xx);

        summ(10, 12, 15);

        int vbb = three(1, 1, 1);
        System.out.println(vbb);
        int vb=summ3(4,4,4);
        System.out.println(vb);

        String w=wether("NYC","Sunny");
        System.out.println(w);
    }

    public static void hello(String name) {
        System.out.println("Hello " + name);
    }

    public static void lenght(double radius) {
        System.out.println("Lenght= " + 2 * 3.14 * radius);
    }

    public static void summ(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static int three(int a1, int b1, int c1) {
        int symma = a1 + b1 + c1;
        return symma;

    }


    public static int summ3(int a2, int b2, int c2) {
        int tr = a2 + b2 + c2;
        return tr;
    }
    public static String wether(String City,String Weather){
        return "Today is the "+ Weather+"  in the "+City;
    }


}

