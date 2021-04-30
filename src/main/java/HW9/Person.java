package HW9;

public class Person {
    public String name;
    public String lastName;
    public int year;

    public void start() {
        System.out.println(name+" "+lastName+" "+year+" go to work");
        System.out.println(name+" "+lastName+" "+year+" return from work");
    }

    public String getName(){
        return name;
    }
    public int getYear(){
        return year;

    }

}
