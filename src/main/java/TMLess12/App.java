package TMLess12;

public class App {
    public static void main(String[] args) {
        String  xx = "I'm string";

        System.out.println(xx.length());
        System.out.println(xx.charAt(0));

        IAmericanElectricalPlug printer = new MyPrinter("My","My Model");
        IAmericanElectricalPlug dd = new MyDesktopLight();

        IAmericanElectricalPlug[] plugs = {printer, dd};
                for (IAmericanElectricalPlug plug : plugs){
                    plug.americanPlug();
                }

//        IAmericanElectricalPlug cc =new IAmericanElectricalPlug();


    }
}
