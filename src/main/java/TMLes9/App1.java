package TMLes9;

public class App1 {
    public static void main(String[] args) {
        Student anna = new Student("Anna", "Jones", 2001, "Math");
        Student michael = new Student("Michael", "Roberts", 200);
        Student samuel = new Student();
        samuel.setLastname("Dobson");
        samuel.setName("Samuel");
        samuel.setYear(1998);

        Fruits apple = new Fruits("Apple");
        Fruits peach = new Fruits();
        peach.setName("Peach");

        System.out.println(apple.getName());
        System.out.println(peach.getName());

        Student xx = new Student("xx","zz", 33);


        Colors car = Colors.BLUE;
        School newHighSchool = new School();
        newHighSchool.addresss = "address";
        newHighSchool.name = "School";
        newHighSchool.type = Schooltype.PUBLIC;
    }
}
