package lesson9x;

public class App1 {
    public static void main(String[] args) {
        Student anna = new Student("Anna", "Jones", 2001, "Math");
        Student michael = new Student("Michael", "Roberts", 2000);


        Student samuel = new Student();
        samuel.setLastName("Dobson");
        samuel.setName("Samuel");


        Fruit apple = new Fruit("Apple");
        Fruit peach = new Fruit();
        peach.setName("Peach");

        System.out.println(apple.getName());
        System.out.println(peach.getName());


        Colors car = Colors.RED;
        // "RED", "Red", "red"

        School newDorpHighSchool = new School();
        newDorpHighSchool.address = "12 New Dorp Lane, State Island, New York";
        newDorpHighSchool.name="New Dorp HighSchool";
        newDorpHighSchool.type=SchoolType.PUBLIC;
    }
}
