package lesson12ab;

public class MyDesktopLight implements IAmericanElecPlugs, IBulbE27{

    @Override
    public void americanPlug() {
        System.out.println("Hi! I'm keeping correct size for the plug");

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
