package Lesson9Encapsolytion;



public class App1Constructor  {
    public static void main(String[] args) {
        Student ann=new Student("Anna","Jones",2001, "Math");
        Student michael= new Student("Michael","Roberts",2000);
        Student samuel=new Student();
        samuel.setLastname("Dabson");
        samuel.setName("Samuel");

        samuel.printInfo();

        Fruit apple=new Fruit("Apple");
        Fruit peach =new Fruit();
        peach.setName("Peach");

        System.out.println(apple.getName());
        System.out.println(peach.getName());

        Colors car=Colors.RED;

        School newDorpHighSchool=new School();
        newDorpHighSchool.adress="12 New Dorp Lane, Staten Island, New York";
        newDorpHighSchool.name="New Dorp High School";
        newDorpHighSchool.type=SchoolType.PUBLIC;




    }


}
