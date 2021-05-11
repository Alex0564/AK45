package test2;

public class HW8 {
    public static void main(String[] args) {
        String a = "Pagero";
        String[] b = {"Pagero", "Nissan"};
        int c = 4;
        double c1 = 2.5;
        int[] x = {4, 5, 6};

        char e = 't';
        System.out.println(a + " " + (b[0]) + " " + c + " " + c1 + " " + (x[2]));


        summa(5, 7);
        System.out.println(Hello("Artuom", "Kudryashov"));

    }

    public static void summa(int a, int b) {
        int c = a + b;
        System.out.println("Summa= " + c);


    }

    public static String Hello(String name, String LastName) {
        return "Hello-hello-hello "+name+" "+LastName;


    }


}
