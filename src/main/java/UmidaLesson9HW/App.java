package UmidaLesson9HW;


public class App {
    public static void main(String[] args){

        System.out.println("1st class 'Clothes'");

        //full constructor
        Clothes blazer = new Clothes("yellow", 52, "office");
        Clothes dress = new Clothes("floral", 42, "romantic");

        //default constructor
        Clothes jacket = new Clothes();
        jacket.setColor("beige");
        jacket.setSize(50);
        jacket.setStyle("casual");

        //invoke methods of every object
        blazer.printInfo();
        dress.printInfo();
        jacket.printInfo();



        System.out.println("2nd class 'Font'");

        //full constructor
        Font Arial = new Font("Arial", "black", 14);
        Font TimesNewRoman = new Font("TimesNewRoman", "metallic", 12);

        //default constructor
        Font Verada = new Font();
        Verada.setColor("red");
        Verada.setSize(9);
        Verada.setName("Verada");

        //invoke methods of every object
        Arial.printInfo();
        TimesNewRoman.printInfo();
        Verada.printInfo();



        System.out.println("3rd class 'Pastry'");

        //full constructor
        Pastry croissant = new Pastry("croissant", "chocalate", 5);
        Pastry muffin = new Pastry("muffin", "strawberry cream", 8);

        //default constructor
        Pastry brioje = new Pastry();
        brioje.setFilling("almond cream");
        brioje.setPrice(5);
        brioje.setName("brioje");

        //invoke methods of every object
        croissant.printInfo();
        muffin.printInfo();
        brioje.printInfo();



        System.out.println("4th class 'Ring'");

        //full constructor
        Ring weddingRing = new Ring("ruby", "Bvlgari", 14000, "ring");
        Ring proposalRing = new Ring("diamond", "Tiffany&Co", 25542, "ring");

        //default constructor
        Ring eternalLove = new Ring();
        eternalLove.setGem("crystal");
        eternalLove.setPrice(4852);
        eternalLove.setName("ring");
        eternalLove.setManufacturer("Dior");

        //invoke methods of every object
        weddingRing.printInfo();
        proposalRing.printInfo();
        eternalLove.printInfo();



    }

}