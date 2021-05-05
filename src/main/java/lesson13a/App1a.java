package lesson13a;

public class App1a {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
        a=10;
        System.out.println(b);

        Person p1 = new Person("Anna");
        Person p2 = p1;

        p1.setName("Vika");

        int[]arr = {1,3,2};
        int[]brr=arr;
        arr[0]=100;
//        System.out.println([0]);


    }
}
