package homework17;

public class BlueWhale extends Whales{
    private String name;
    public void feedMilk(){
        System.out.println("Blu whales feed milk newborns");
    }
    public void spine(){
        System.out.println("Blu whales have spin");
    }
    public void move(){
        System.out.println("Blu whales can move");
    }
    public void canBreath(){
        System.out.println("Blu whales can breath");
    }
    public void canReproduce(){
        System.out.println("Blue whales can reproduce");
    }
    public void canEat(){
        System.out.println("Blue whales can eat");
    }

    public BlueWhale(String name) {
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
