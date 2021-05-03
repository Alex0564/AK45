package lesson9;

public class App1 {
    public static void main(String[] args) {
        Student ann = new Student("Anna","Jones",2001,"Math");
        Student michael = new Student("Michael","Roberts",2000);
        Student samuel = new Student();
        samuel.setLastName("Dobson");
        samuel.setName("Samuel");


        Fruit apple = new Fruit("Apple");
        Fruit peach = new Fruit();
        peach.setName("Peach");

        System.out.println(apple.getName());
        System.out.println(peach.getName());

        Student xx = new Student("XX","ZZ",333);


        Colors car = Colors.RED;
        // "RED", "Red", "red"

        School newDorpHighSchool = new School();
        newDorpHighSchool.address = "12 New Dorp Lane, Staten Island, New York";
        newDorpHighSchool.name = "New Dorp High School";
        newDorpHighSchool.type = SchoolType.PUBLIC;

    }
}
