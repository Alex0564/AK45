package lesson12ab;

public class App {
    public static void main(String[] args) {
        String xx = "I'm string";
        System.out.println(xx.length());

        System.out.println(xx.charAt(0));

        IAmericanElecPlugs printer = new MyPrinter("My", "My");
        IAmericanElecPlugs dd = new MyDesktopLight();

        IAmericanElecPlugs[] plugs = {printer, dd};
        for (IAmericanElecPlugs plug: plugs){
            plug.americanPlug();
        }
    }
}
