package Lesson9a;

public class App4 {
    public static void main(String[] args) {

        Sneakers mySneakers = new Sneakers("Adidas","Read","XL");
        mySneakers.printInfo();

        Sneakers yourSneakers = new Sneakers();
        yourSneakers.setMake("Nike");
        yourSneakers.setColor("Blue");
        yourSneakers.setSize("L");
        yourSneakers.printClass();
    }



}
