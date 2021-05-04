package lesson12vk77;

public class App {
    public static void main(String[] args) {
        String xx="Im string";
        System.out.println(xx.charAt(0));


        iAmericanElectricalPlug printer = new MyPrinter("My","model");
        iAmericanElectricalPlug dd = new MyDesktopLight();

        iAmericanElectricalPlug[] plugs = {printer,dd};
        for (iAmericanElectricalPlug plug:plugs){
            plug.americanPlug();
        }
    }
}
