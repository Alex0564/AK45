package HM11;

public class App {
    public static void main(String[] args) {

        Adress alexAdress = new Adress("7501 Ridge Blvd", "Brooklyn", State.NY, "11209");
        Person alex = new Person(alexAdress,"Alex", "Morgan", "1989");

        String streetAdressOfAlex = alex.getAdress().getAdressLine1();
        System.out.println(streetAdressOfAlex);

        House house = new House(alexAdress, alex, 4,3,1999);
        streetAdressOfAlex = house.getOwner().getAdress().getAdressLine1();
    System.out.println(streetAdressOfAlex);


}
}











