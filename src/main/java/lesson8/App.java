package lesson8;

public class App {
    public static void main(String[] args) {
   Person victor = new Person();
   victor.name = "Victor";
   victor.lastName = "Lopez";
   victor.year = 1992;

   Person lilly = new Person();
   lilly.name = "Lilly";
   lilly.lastName = "Zamir";
   lilly.year = 1991;

   System.out.println(victor.lastName);


   Phone myPhone = new Phone();
   myPhone.color = "Black";
   myPhone.make = "Iphone";
   myPhone.year = 2020;

   Phone myFriends = new Phone();
   myFriends.color = "Blue";
   myFriends.make = "Samsung";
   myFriends.year = 2019;

   System.out.println(myPhone.make);

   Vehicle myCar = new Vehicle();
   myCar.color = "Black";
   myCar.make = "Lexus";
   myCar.model = "RX350";
   myCar.year = 2020;

   Vehicle myFriendsCar = new Vehicle();
   myFriendsCar.color = "Red";
   myFriendsCar.make = "Volvo";
   myFriendsCar.model = "XC90";
   myFriendsCar.year = 2019;

   System.out.println(myFriendsCar.make);

   Snickers mySnickers = new Snickers();
   mySnickers.make = "Nike";
   mySnickers.color = "Pink";
   mySnickers.year = 2020;

   Snickers myFriendsSnickers = new Snickers();
   myFriendsSnickers.make = "Adidas";
   myFriendsSnickers.color = "Green";
   myFriendsSnickers.year = 2019;

   System.out.println(mySnickers.make);

   myCar.start();
   myFriendsCar.start();

   victor.start();


   myPhone.start();
   myFriends.start();

   myFriendsSnickers.start();
   mySnickers.start();
    }
}
