package extraLesson;

public class App {
    public static void main(String[] args) {
        int numberOfDays; // Camel Case
        int number_of_days; // Snake case
        final int DAY_OFF = 5;
//        DAY = 7; //final can't be changed
//        System.out.println(numberOfDays);

        int x;
        char y;
        boolean z;

        char[] ch = new char[2];//default value - symbol
        System.out.println("Default value of char: " + ch[0]);
        int[] a = new int[3]; //default value - 0
        System.out.println("Deafult value of int: " + a[1]);
        boolean[] booleans = new boolean[4];//default value - false
        System.out.println("Default value of boolean: " + booleans[1]);
        String[] Person = new String[3];//default value - null
        System.out.println("Default value of String: " + Person[1]);

        String s;
        s = "Hello";
        String xx = s.replace("e", "E");//replace old character
        System.out.println(xx);

    }
}
