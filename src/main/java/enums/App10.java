package enums;

import java.util.Arrays;

public class App10 {
    public static void main(String[] args) {

        Plant pl1 = new Plant("Rose", "Red", 1);
        Plant pl2 = new Plant();
        pl2.setName("Currant");
        pl2.setColor("Black");
        pl2.setAge(3);

        pl1.printPlant();
        System.out.println("Name = " + pl2.getName() + ", Color = " + pl2.getColor() + " , Age = " + pl2.getAge());

        Wood wood1 = new Wood("Magnolia", "Green", 9, Blossom.SPRING);
        Wood wood2 = new Wood();
        wood2.setName("Lilac");
        wood2.setColor("Green");
        wood2.setAge(7);
        wood2.setBlossom(Blossom.SPRING);

        wood1.printWood();
        System.out.println("Name = " + wood2.getName() + ", Color = " + wood2.getColor() + " , Age = " + wood2.getAge() + ", Blossom = " + wood2.getBlossom());

        Flower flower1 = new Flower("Violet", "Green", 2);
        Buds[] buds1 = {Buds.RED, Buds.YELLOW, Buds.WHITE, Buds.BLUE, Buds.PINK};
        flower1.setBuds(buds1);

        flower1.printFlower();
        System.out.println(Arrays.toString(flower1.getBuds()));
    }
}
