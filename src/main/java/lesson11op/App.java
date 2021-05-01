package lesson11op;

public class App {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = new String("Hello");

        Address davidAddress = new Address("12 Elm st", "Gotham city", State.NY, "10010");
        Person david = new Person(davidAddress, "David", "Attonboro", 1947);

        String streetAddressdOfDavid = david.getAddress().getAddressline1();
        System.out.println(streetAddressdOfDavid);

        House house = new House(davidAddress,david,3,2, 2020);
        streetAddressdOfDavid = house.getOwner().getAddress().getAddressline1();
        String zip = house.getAddress().getZip();
        zip = house.getOwner().getAddress().getZip();

        Person x = house.getOwner();
        Address y = x.getAddress();
        String z = y.getAddressline1();


    }
}
