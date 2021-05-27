package hw9;

public class App {
    public static void main(String[] args) {
        Fish Koi = new Fish();
        Koi.setName("Koi");
        Koi.setType("Ogon");
        Koi.setColor("white and Red");

        System.out.println(Koi.getColor());

        System.out.println(Koi.getName());

        System.out.println(Koi.getType());



        Juice Tropicana = new Juice();
        Tropicana.setName("Tropicana");
        Tropicana.setSize("Large");
        Tropicana.setType("Orange");

        System.out.println(Tropicana.getName());
        System.out.println(Tropicana.getType());
        System.out.println(Tropicana.getSize());




        Table plastic = new Table();
        plastic.setMade("plastic");
        plastic.setType("kitchen");
        plastic.setSize("small");

        System.out.println(plastic.getType());
        System.out.println(plastic.getMade());
        System.out.println(plastic.getSize());






        Laptop Sony = new Laptop();
        Sony.setBrand("HP");
        Sony.setColor("Silver");
        Sony.setSoftware("windows");


        Sony.printInfo();

        Koi.printInfo();

        Tropicana.printInfo();










    }
}
