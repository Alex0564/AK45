package lesson12;

public class MyDesktopLight implements IAmericanElectricalPlug, IBulbE27{
    @Override
    public void americanPlug() {
        System.out.println("Hi! I'm keeping correct size for plug");
    }

    @Override
    public int innerVoltage() {
        return 5;
    }

    @Override
    public int outVoltage() {
        return 0;
    }

    @Override
    public void keepE27() {
        System.out.println("Yep -> Correct size");
    }
}
