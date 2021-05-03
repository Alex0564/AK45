package hw9daria;

public class EncTwo {
    public static void main(String[] arg) {
        Flowers rose = new Flowers();
        rose.setName("Rose");
        rose.setColor("Red");
        rose.setPopularity("very popular");
        rose.setSteam("Long");
        System.out.println(rose.getColor()+" is the color. "+rose.getName()+" is the name. Populariy: "+rose.getPopularity()+". And the steam is "+rose.getSteam()+".");


    }
}