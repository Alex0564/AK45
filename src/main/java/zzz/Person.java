package zzz;

public class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toPrint() {
        return "Person " +
                "name='" + name + '\''
                ;
    }
}
