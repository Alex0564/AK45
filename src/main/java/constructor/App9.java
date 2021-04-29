package constructor;

public class App9 {
    public static void main(String[] args) {
        Furniture fur1 = new Furniture("Table", "New", "Brown");
        Furniture fur2 = new Furniture();
        fur2.setTypeFurniture("Chair");
        fur2.setConditionFurniture("Used");
        fur2.setColorFurniture("Black");

        fur1.printFurniture();
        fur2.printFurniture();

        Phone phone1 = new Phone("iPhone", 12, 2020);
        Phone phone2 = new Phone();
        phone2.setBrandPhone("Pixel");
        phone2.setModelPhone(5);
        phone2.setYear(2020);

        phone1.printPhone();
        phone2.printPhone();

        Plant plant1 = new Plant("Orchid", "White", 2);
        Plant plant2 = new Plant();
        plant2.setNamePlant("Hibiscus");
        plant2.setColor("Red");
        plant2.setAgePlant(5);

        plant1.printPlant();
        plant2.printPlant();

        Vegetable vegetable1 = new Vegetable("Carrot", "Orange", "Sweet");
        Vegetable vegetable2 = new Vegetable();
        vegetable2.setNameVegetable("Onion");
        vegetable2.setColorVegetable("Green");
        vegetable2.setFlavorVegetable("Bitter");

        vegetable1.printVegetable();
        vegetable2.printVegetable();

        Dress dress1 = new Dress();
        dress1.setTypeDress("Blouse");
        dress1.setColorDress("Pink");
        dress1.setSizeDress(46);

        System.out.println(dress1.getTypeDress() + " " + dress1.getColorDress() + " " + dress1.getSizeDress());

        Drink drink1 = new Drink();
        drink1.typeDrink = "Tea";
        drink1.condition = ConditionDrink.HOT;
        drink1.colorDrink = "Green";

        System.out.println(drink1.typeDrink + " " + drink1.condition + " " + drink1.colorDrink);

    }

}
