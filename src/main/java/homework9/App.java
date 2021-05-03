package homework9;

public class App {
    public static void main (String[] args) {

        //Class "Menu"
        Menu holiday = new Menu ("Stuffed Mashrooms", "Salmon", "Cake", "Coffee");
        System.out.println("I would like to have " + holiday.getDessert() + " and " + holiday.getDrink());

        Menu branch = new Menu();
        branch.setAppetizer("Stuffed Mashrooms");

        System.out.println(branch.getAppetizer());

        //Class'Salad'

        Salad simple = new Salad( "Tomatoes", "Cucumber", "Pepper", "Salt", "Olive Oil");
        System.out.println("Cut into pieces " + simple.getIngr1()+ ", "+simple.getIngr2()+", and "+ simple.getIngr3()+ ". Combine all, add "+ simple.getIngr4()+ " and "+simple.getIngr5()+ ", and mix it.");

        Salad veg = new Salad();
        veg.setIngr1("Eggplant");
        System.out.println("I like "+ veg.getIngr1());

        //Class "Calc"

        Calc add = new Calc(22.3, -1);
        System.out.println("c = " + add.getC());

        Calc circleArea = new Calc();
        circleArea.setA(10);
        System.out.println("Circle Area = " + circleArea.getArea());

        //Enum
        Shapes figure = new Shapes();
        figure.name = "Triangle";
        figure.numOfSides = 3;
        figure.type = GeometricFigures.PLANE;


    }

}
