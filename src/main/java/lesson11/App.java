package lesson11;

public class App {
    public static void main(String[] args) {

        String str = "Hello";
        String str1 = new String("Hello");

        Address davidAddress = new Address("12 Elm st","Gotham city",State.NY,"10018");
        Person david = new Person(davidAddress,"David","Attenboro",1949);

        String streetAddressOfDavid = david.getAddress().getAddressLine1();
        System.out.println(streetAddressOfDavid);

        House house = new House(davidAddress,david,3,2,2020);
        streetAddressOfDavid = house.getOwner().getAddress().getAddressLine1();
        String zip = house.getAddress().getZip();
//        zip = ((house.getOwner()).getAddress()).getZip();
          zip=(house.getOwner()).getAddress().getZip();
        Person x = house.getOwner();
        Address y = x.getAddress();
        String z = y.getAddressLine1();


    }
}
