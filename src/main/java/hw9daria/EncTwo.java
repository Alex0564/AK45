package hw9daria;

public class EncTwo {
    public static void main(String[] arg) {
        Flowers rose = new Flowers();
        rose.setName("Rose");
        rose.setColor("Red");
        rose.setPopularity("very popular");
        rose.setSteam("Long");
        System.out.println(rose.getColor()+" is the color. "+rose.getName()+
                " is the name. Populariy: "+rose.getPopularity()+". And the steam is "
                +rose.getSteam()+".");

        Chocolate Lindt = new Chocolate();
        Lindt.setBrand("Lindt");
        Lindt.setTaste("Bitter-sweet");
        Lindt.setType("Dark");
        Lindt.setWeight(100);
        System.out.println(Lindt.getBrand()+" is the brand. "+Lindt.getTaste()+
                " is the taste. The type is "+Lindt.getType()+". And the weight is "
                +Lindt.getWeight()+" gramms.");

        Shoes sandals = new Shoes("Sandals", "Prada", "Leather");
        Shoes tennisshoes = new Shoes ("Tennis Shoes", "Lacoste", "Leather", 39);

        sandals.getinfo();
    }
}