package hw8;

public class Work8 {

    public static void main(String[]args){
    Address mail1 = new Address();
        mail1.number = 1442;
        mail1.name = "Fairway Drive";
        mail1.index = 60563;

        Address mail2 = new Address();
        mail2.number = 6870;
        mail2.name = "Heisenberg Lane";
        mail2.index = 16985;

        mail1.send();
        mail2.send();



        Furniture table = new Furniture();
        table.name = "Ampire table";
        table.color = "black";
        table.price = 450;

        Furniture chair = new Furniture();
        chair.name = "Ampire Chair";
        chair.color = "black";
        chair.price = 50;

        table.sale();
        chair.sale();



        Vegetable carrot = new Vegetable();
        carrot.name = "Amsterdam carrot";
        carrot.price = 2.25;

        Vegetable onion = new Vegetable();
        onion.name = "White onion";
        onion.price = 3.29;

        carrot.sale();
        onion.sale();

        Phone lot1 = new Phone();
        lot1.name = "Samsung";
        lot1.model = "S20";
        lot1.problem = "Screen doesn't work";

        Phone lot2 = new Phone();
        lot2.name = "Apple";
        lot2.model = "X";
        lot2.problem = "Doesn't turn on";

        lot1.fix();
        lot2.fix();


    }
}
