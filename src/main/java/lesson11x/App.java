package lesson11x;

public class App {
    public static void main(String[] args) {

        String str = "Hello";
        String str1 = new String("Hello");

        Address davidAddress = new Address("12 Elm st", "Gotham city", State.NY, "10018");
        Person david = new Person(davidAddress, "David", "Attenboro", 1949);

        String streetAddressOfdavid = david.getAddress().getAddressLine1();
        System.out.println(streetAddressOfdavid);

        House house = new House(davidAddress,david, 3,2,2020);
        streetAddressOfdavid = house.getOwner().getAddress().getAddressLine1();
        System.out.println(streetAddressOfdavid);

        streetAddressOfdavid = house.getOwner().getAddress().getZip();
        System.out.println(streetAddressOfdavid);

        String zip = house.getAddress().getZip();
        zip = house.getOwner().getAddress().getZip();

        Person x =house.getOwner();
        Address y =x.getAddress();
        String z = y.getAddressLine1();


    }
}
