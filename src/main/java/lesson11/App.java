package lesson11;

public class App {
    public static void main(String[]args) {
        Address davidAddress=new Address("12 Elm st","Gotham",State.NY,10003);
        Person david=new Person(davidAddress,"David","Hans",1998);
        String street= david.getAddress().getAddressLine1();

    }
}
