package TMLess11;

public class App {
    public static void main(String[] args) {

        String str = "Hello";
        String str1 = new String("Hello");

        Address davidAddress = new Address("12 Elm st","Gotham city", State.NY,"10018");
        Person david = new Person(davidAddress, "David","Attenboro", 1949);

        String streetDavid = david.getAddress().getAddressLine1();
        System.out.println(streetDavid);

        House house = new House(davidAddress, david, 3, 2, 2020);
        streetDavid = house.getOwner().getAddress().getAddressLine1();
        String zip = house.getAddress().getZip();
        String zip1 = house.getOwner().getAddress().getZip();

        System.out.println(zip1);


    }
}
