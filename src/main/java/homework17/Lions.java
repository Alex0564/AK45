package homework17;

public class Lions extends Carnivores{
    private String name;

    public void feedMilk(){
        System.out.println("Lions feed milk newborns");
    }
    public void spine(){
        System.out.println("Lions have spin");
    }
    public void move(){
        System.out.println("Lions can move");
    }
    public void canBreath(){
        System.out.println("Lions can breath");
    }
    public void canReproduce(){
        System.out.println("Lions can reproduce");
    }
    public void canEat(){
        System.out.println("Lions can eat");
    }

    public Lions(String name) {
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
