package homework8;

public class App {
    public static void main(String[] args){

        Rectangle blue = new Rectangle();
        blue.width = 4;
        blue.length = 6;
        blue.area = blue.width * blue.length;
        blue.perimeter = 2 * ( blue.width + blue.length );
        System.out.println(blue.area);
        blue.fence();

        Ingrediens pizza = new Ingrediens();
        pizza.dough = "pizza dough";
        pizza.sauce = "tomato sauce";
        pizza.cheese = "cheese";
        System.out.println(pizza.make());

        Person ind = new Person();
        ind.fName = "Alla";
        ind.lName = "Smith";
        ind.age = 35;
        System.out.println(ind.fName + ind.lName);

        House home = new House();
        home.roomOne = "Livingroom";
        home.roomTwo = "Kitchen";
        home.roomThree = "Bedroom";
        home.numOfBedrooms = 3;
        System.out.println(home.live());

        System.out.println(ind.fName + " " + ind.lName + " lives in a " + home.numOfBedrooms + " " + home.roomThree + " house." );





    }
}
