package lesson9ez;

public class App1 {
    public static void main(String[] args) {
        Student ann = new Student("Anna","Jones",2001,"Math");
        Student michael = new Student("Michael","Roberts",2000);
        Student samuel = new Student();
        samuel.setLastName("Dobson");
        samuel.setName("Samuel");
        samuel.setYear(2002);

        Fruit apple = new Fruit("Apple");
        Fruit peach = new Fruit();
        peach.setName("Peach");

        System.out.println(apple.getName());
        System.out.println(peach.getName());

        Colors car = Colors.RED;
        // "RED", "Red", "red"

        School newDorphHighSchool = new School();
        newDorphHighSchool.address = "12 New Dorp Lane, Staten Island, New York";
        newDorphHighSchool.name = "New Dorp High School";
        newDorphHighSchool.type = SchoolType.PUBLIC;

    }
}
