package lesson9op;

public class App1 {
    public static void main(String[] args) {
        Student ann = new Student("Anna","Jones", 2001, "Math");
        Student michaei = new Student("Michael", "Jobes",2000);
        Student samuel = new Student();

        Fruit apple = new Fruit("Apple");
        Fruit peach = new Fruit();
        peach.setName("Peach");

        System.out.println(apple.getName());
        System.out.println(peach.getName());

        Color car = Color.RED;

        Student xx = new Student("xx", "yy", 333);

        School newDorpHighSchool = new School();
        newDorpHighSchool.address = "12 Dorp Street Springfield";
        newDorpHighSchool.name = "New Dorp High School";
        newDorpHighSchool.type = SchoolType.PUBLIC;




    }

}