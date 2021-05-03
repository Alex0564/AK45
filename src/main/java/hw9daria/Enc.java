package hw9daria;

public class Enc {
    public static void main (String []args){
        Glasses Sun = new Glasses();
        Sun.settype("Sunglasses");
        Sun.gettype();
        Sun.setcolor("Blue");
        Sun.getcolor();
        System.out.println(Sun.gettype());
        System.out.println(Sun.getcolor());
        Sun.printInfo();

        Pet Cat = new Pet();
        Cat.setgender("female");
        Cat.setkind("cat");
        Cat.setFur("fluffy");
        Cat.setname("Snowy");
        Cat.printInfo();

//        Brand Prada = new Brand();
//        Prada.setname("Prada");
//        Prada.setOrigin("Italy");
//        Prada.setPricerange("luxury brand");
//        System.out.println(Prada.getName());
//        System.out.println(Prada.getOrigin());
        Brand Prada= new Brand("Prada", "Italy", "Luxury");
        Galaxy Mercury=new Galaxy("Mercury", "small", 29596837);
        Galaxy Jupiter=new Galaxy ("Jupiter", "big");
        System.out.println();


    }

}
