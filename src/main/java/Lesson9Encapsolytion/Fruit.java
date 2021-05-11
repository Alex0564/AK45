package Lesson9Encapsolytion;

public class Fruit {
    private String name;
    public Fruit(String name){
        this.name=name;

    }
    public Fruit(){}

   /* public void setName(String name) {
        this.name = name;

    }*/

   /* public void setName(String name) {
        this.name = name;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;

    }
}
