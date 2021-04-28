package UmidaLesson8HW;

public class App {
    public static void main (String[] args) {
        Clothes Dress = new Clothes();
        Dress.category = "Dress";
        Dress.color = "yellow";
        Dress.size = 42;
        Dress.style = "romantic";
        //System.out.println(Dress.color);

        Clothes Blazer = new Clothes();
        Blazer.category = "Blazer";
        Blazer.size = 54;
        Blazer.style = "office";
        Blazer.color = "beige";
        //System.out.println(Blazer.style);

        Font booksfont = new Font();
        booksfont.name = "Calibri";
        booksfont.color ="black";
        booksfont.size = 11;
        //System.out.println(booksfont.color);

        Font resumesfont = new Font();
        resumesfont.size = 13;
        resumesfont.color = "black";
        resumesfont.name = "Times New Roman";
        //System.out.println(resumesfont.name);

        Pastry freshBakery = new Pastry();
        freshBakery.filling = "almond cream";
        freshBakery.name = "croissant";
        freshBakery.price = 5;
        //System.out.println(freshBakery.name);

        Pastry buffetBaking = new Pastry();
        buffetBaking.price = 3;
        buffetBaking.name = "muffins";
        buffetBaking.filling = "strawberry cream";
        //System.out.println(buffetBaking.name);

        Ring weddingRing = new Ring();
        weddingRing.name = "ring";
        weddingRing.gem = "diamond";
        weddingRing.manufacturer = "Tiffany.Co";
        weddingRing.price = 32000;
        //System.out.println(weddingRing.gem);

        Ring engagementRing = new Ring();
        engagementRing.name = "ring";
        engagementRing.price = 7500;
        engagementRing.manufacturer = "Bvlgari";
        engagementRing.gem = "ruby";
        //System.out.println(engagementRing.gem);

        Dress.buy();
        resumesfont.create();
        buffetBaking.get();
        engagementRing.proposal();

    }
}
