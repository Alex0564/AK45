package homework.homework17;

public class Wolf extends Carnivores{
    private String name;
    public void feedMilk(){
        System.out.println("Wolfs feed milk newborns");
    }
    public void spine(){
        System.out.println("Wolfs have spin");
    }
    public void move(){
        System.out.println("Wolfs can move");
    }
    public void canBreath(){
        System.out.println("Wolfs can breath");
    }
    public void canReproduce(){
        System.out.println("Wolfs can reproduce");
    }
    public void canEat(){
        System.out.println("Wolfs can eat");
    }

    public Wolf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Information about "+name+":";
    }
}
