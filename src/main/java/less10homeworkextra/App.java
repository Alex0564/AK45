package less10homeworkextra;

public class App {
    public static void main(String[] args) {
    Phone iPhone12 = new Phone(Colour.BLACK, Manufacturer.APPLE, 5.4, 64);
        System.out.println(iPhone12);
        Colour[] Colours = {Colour.BLACK, Colour.BLUE, Colour.PURPLE, Colour.GREEN, Colour.WHITE};
        iPhone12.setColour(Colours[3]);
        System.out.println("The colour of iPhone12 is "+iPhone12.getColour());

        Tablet tabA7 = new Tablet();
        tabA7.setBrand(Manufacturer.SAMSUNG);
        tabA7.setScreen(10.4);
        tabA7.setMemory(32);
        tabA7.setColour(Colours[4]);
        System.out.println(tabA7);
    }

}

