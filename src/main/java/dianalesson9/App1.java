package dianalesson9;

public class App1 {
    public static void main(String[] args) {
        Student anna = new Student("Anna", "Jones", 2001, "Math");
        Student michael = new Student("Michael", "Roberts", 2000);
        Student samuel = new Student();
        samuel.setName("Dobson");
        samuel.setName("Samuel");


        Fruit apple = new Fruit("Apple");
        Fruit peach = new Fruit();
        peach.setName("Peach");

        System.out.println(apple.getName());
        System.out.println(peach.getName());
    }
}
