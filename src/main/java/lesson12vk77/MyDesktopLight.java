package lesson12vk77;

public class MyDesktopLight implements iAmericanElectricalPlug, IBulbE27{

    @Override
    public void keepE27() {
        System.out.println("Yeap -> correct size!");
    }

    @Override
    public void americanPlug() {
        System.out.println("Hi! keeping correct size for plug");
    }

    @Override
    public int innerVoltage() {
        return 5;
    }
}
