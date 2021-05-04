package lesson12x;

public class App {
    public static void main(String[] args) {
        String xx = "I'm string";

        System.out.println(xx.charAt(0));

        IAmericanElectricalPlug printer = new MyPrinter("My", "My");
        IAmericanElectricalPlug dd = new MyDesktopLight();

        IAmericanElectricalPlug[]plugs = {printer,dd};
        for(IAmericanElectricalPlug plug: plugs ){
            plug.americanPlug();
        }





    }
}
