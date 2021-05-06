package lesson12;

public class MyDesktopLight implements IAmericanElectricalPlug, IBulbE27{

    @Override
    public void americanPlug() {
        System.out.println("Hi! I am keeping correct size for plug");
    }

    @Override
    public int innerVoltage() {
        return 5;

    }

    @Override
    public void keepE27() {
        System.out.println("Yep-> correct size");
    }
}
