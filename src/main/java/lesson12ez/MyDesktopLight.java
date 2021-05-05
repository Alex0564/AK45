package lesson12ez;

public class MyDesktopLight implements IAmericanElectricalPlug, IBulbE27{
    @Override
    public void americanPlug() {
        System.out.println("Hi! I'm keeping size for plug");
    }

    @Override
    public int innerVoltage() {
        return 5;
    }

    @Override
    public void keepE27() {
        System.out.println("Yep -> Correct size");

    }
}
