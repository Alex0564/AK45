package hw17;

public class BlueWhale extends Whales {

    public BlueWhale(String type, String name) {
        super(type, name);

    }

    public void reproduce() {
        System.out.println("I can reproduce via sexual meiosis;");

    }

    public void warm_blooded() {
        System.out.println("I am warm-blooded vertebrate;");
    }

    @Override
    public String toString() {
        return "BlueWhales{" +
                "Whales type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

