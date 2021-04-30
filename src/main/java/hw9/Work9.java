package hw9;

public class Work9 {
    public static void main(String[]args){
        Address mail1 = new Address();
        mail1.setNumber(1542);
        mail1.setName("Diehl Road");
        mail1.setIndex(60832);

        System.out.println(mail1.getNumber());
        System.out.println(mail1.getName());
        System.out.println(mail1.getIndex());

        mail1.printInfo();

        Address mail2 = new Address(13789, "Stonebridge Circle", 50638);
        System.out.println(mail2.getNumber());
        System.out.println(mail2.getName());
        System.out.println(mail2.getIndex());

        mail2.printInfo();



        Furniture table = new Furniture();
        table.setName("Table M");
        table.setColor("Black");
        table.setPrice(364.99);

        System.out.println(table.getName());
        System.out.println(table.getColor());
        System.out.println(table.getPrice());

        table.printInfo();

        Furniture chair = new Furniture("Chair M", "Black",59.99);
        System.out.println(chair.getName());
        System.out.println(chair.getColor());
        System.out.println(chair.getPrice());

        chair.printInfo();



        Phone samsung = new Phone();
        samsung.setName("Samsung");
        samsung.setModel("S10");
        samsung.setPrice(999.99);

        System.out.println(samsung.getName());
        System.out.println(samsung.getModel());
        System.out.println(samsung.getPrice());

        samsung.printInfo();

        Phone apple = new Phone("Apple", "X", 999.99);
        System.out.println(apple.getName());
        System.out.println(apple.getModel());
        System.out.println(apple.getPrice());

        apple.printInfo();



        Vegetable carrot = new Vegetable();
        carrot.setName("Carrot");
        carrot.setWeight(3);
        carrot.setPrice(2.99);

        System.out.println(carrot.getName());
        System.out.println(carrot.getPrice());
        System.out.println(carrot.getWeight());

        carrot.printInfo();

        Vegetable potato = new Vegetable("Potato", 5, 3.99);
        System.out.println(potato.getName());
        System.out.println(potato.getWeight());
        System.out.println(potato.getPrice());

        potato.printInfo();

    }
}
