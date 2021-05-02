import hw7.HHw6b;
import lesson11a.Address;
import lesson11a.House;
import lesson11a.Person;
import lesson11a.State;

public class App {
    public static void main(String[] args) {

        String str = "Hello";
        String str1 = new String("Hello");

        Address davisAddress = new Address("12 Elm str", "NYC", State.NY, "10017");
        Person david = new Person(davisAddress, "David","Smith", 1949);

        String streetAddressOfDavid = david.getAddress().getAddressLine1();
        System.out.println(streetAddressOfDavid);

        House house = new House(davisAddress,david,3,2,2020);
        streetAddressOfDavid = house.getOwner().getAddress().getAddressLine1();
        String zip = house.getAddress().getZip();
        zip = ((house.getOwner()).getAddress()).getZip();

        Person x = house.getOwner();
        Address y = x.getAddress();
        String z = y.getAddressLine1();

    }
}
