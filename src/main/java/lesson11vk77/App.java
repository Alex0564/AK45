package lesson11vk77;

public class App {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = new String("Hello");

        Address davidAddress = new Address("12 Elm street","Gotham city", State.NY, "10666");
        Person david = new Person(davidAddress,"David","Roberts",1956);

        String streetAddresOfDavid = david.getAddress().getAddressLin1();
        System.out.println(streetAddresOfDavid);

        House house = new House(davidAddress,david,3,2,2020);
        streetAddresOfDavid = house.getOwner().getAddress().getAddressLin1();
        String zip = house.getOwner().getAddress().getZipcode();
    }
}
