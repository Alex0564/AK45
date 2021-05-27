package homework9;

public class App1 {
    public static void main(String[] args) {
        Tires tire1 = new Tires("Bridgestone","All season",19);
        Tires tire2 = new Tires();
        tire2.setBrand("Yokohama");
        tire2.setSeason("Summer");
        tire2.setDiameter(16);

        tire1.printInfo();
        tire2.printInfo();

        Fruit fruit1 = new Fruit("Apple","Green","Sweet");
        Fruit fruit2 = new Fruit();
        fruit2.setName("Lemon");
        fruit2.setColor("Yellow");
        fruit2.setTaste("Sour");

        fruit1.printFruitInfo();
        fruit2.printFruitInfo();

        Jeans jeans1 = new Jeans("Hugo Boss","Blue","XL");
        Jeans jeans2 = new Jeans();
        jeans2.setBrand("Diesel");
        jeans1.setColor("Navy");
        jeans2.setSize("M");

        fruit1.printFruitInfo();
        fruit2.printFruitInfo();

        Calendar motherDOB = new Calendar(16,6,1963);
        Calendar sisterDOB = new Calendar();
        sisterDOB.setDay(18);
        sisterDOB.setMonth(7);
        sisterDOB.setYear(1986);

        motherDOB.printDOB();
        sisterDOB.printDOB();

    }
}
