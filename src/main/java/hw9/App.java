package hw9;

public class App {
    public static void main(String[]args){
        Beverage juice = new Beverage();
        juice.setName("Orange juice");
        juice.setVolume(1.25);
        juice.setPrice(2.99);

        System.out.println(juice.getName());
        System.out.println(juice.getVolume());
        System.out.println(juice.getPrice());


        Tshirt Micky = new Tshirt("MickyMouse","M",12.99);
        System.out.println(Micky.getName());
        System.out.println(Micky.getSize());
        System.out.println(Micky.getPrice());

    }
}
