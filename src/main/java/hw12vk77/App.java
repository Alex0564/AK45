package hw12vk77;

public class App{
    public static void main(String[] args) {
//1        Create an interface and 2 classes which implements it
//2        Create 2 objects of each class
//3        Assign one object to interface type

        // 1 Created 1 interface class Fruit and 2 classes Orange and Apple
        //done!

        //2 Creating 2 objects of each class

        //Apple class objects
        System.out.println("==========objects of class Apple implements interface class IFruit===========");
        Apple greenapple = new Apple("green");
        System.out.println("METHODS RESULTS:");
        greenapple.getRipeSign();
        greenapple.readyToEat();
        Apple redapple = new Apple("red");
        redapple.readyToEat();
        redapple.getRipeSign();

        //Orange class objects
        System.out.println("==========objects of class Orange implements interface class IFruit===========");
        Orange orangeFlorida = new Orange("normal","yellow");
        Orange orangeCalifornia = new Orange("sugar","orange");
        System.out.println("METHODS RESULTS:");
        orangeCalifornia.getRipeSign();
        orangeCalifornia.readyToEat();
        orangeFlorida.getRipeSign();
        orangeFlorida.readyToEat();

        //Lemon
        Lemon lemon = new Lemon("acid","light yellow","thin");
        System.out.println("==========object of class Lemon extends class Orange==========================");
        System.out.println("METHODS RESULTS:");
        lemon.readyToEat();
        lemon.getRipeSign();

        //3 Assign objects to interface type
        System.out.println("==========object of class Lemon extends class Orange==========================");
        System.out.println("METHODS RESULTS:");
        IFruit pear = new Apple("light green","pear");
        IFruit fujiapple = new Apple("magenta");
        pear.getRipeSign();
        pear.readyToEat();
        fujiapple.readyToEat();
        fujiapple.getRipeSign();


        System.out.println("==========-----------------------------------------------------------===========");
        System.out.println("==========object of Interface/class Fruit  as a new type of class Lemon=========");
        IFruit myfruitislemon =new Lemon("sour","orange","thick");
        System.out.println("METHODS RESULTS:");
        myfruitislemon.getRipeSign();
        myfruitislemon.readyToEat();
        System.out.println("==========object of class Orange  as a new type of class Lemon==================");
        Orange myorangeislemon =new Lemon("acid","yellow","thin");
        System.out.println("METHODS RESULTS:");
        myorangeislemon.getRipeSign();
        myorangeislemon.readyToEat();
        //done!







    }
}
