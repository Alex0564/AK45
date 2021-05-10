package lesson12;

public class MyHeater implements IAmericanElectricalPlug {
    private int power;

    @Override
    public int outVoltage() {
        return 110;
    }

    public MyHeater(int power) {
        this.power = power;
    }

    public int getPower() {return power;}

    public int setPower(int power) {this.power = power;
        return power;
    }
    public void americanPlug() {System.out.println("I keep standard and can be used in the USA");
    }
    public int innerVoltage() {
        return 2000;
    }

    @Override
    public String toString() {
        return "MyHeater{" +
                "power=" + power +
                '}';
    }
}
