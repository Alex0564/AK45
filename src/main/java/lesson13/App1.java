package lesson13;

public class App1 {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
        a=10;
        System.out.println(b);

        Person p1 = new Person("Anna");
        Person p2 = p1;

        p1.setName("Vika");
        System.out.println(p2.getName());

        int[]arr = {1,2,3};
        int[]brr=arr;
        arr[0]=100;
        System.out.println(brr[0]);

    }
}
