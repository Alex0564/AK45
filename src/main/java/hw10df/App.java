package hw10df;

public class App {

    public static void main(String[] args) {
     Bear nia = new Bear("Nia","gimalay", 2018, Color.BRAUN);
     Bear don = new Bear("Don","Alaska", 2014,Color.WHITE);

        Tiger mik = new Tiger("Mick","Africa",2008,Color.YELLOW);
        Tiger mia=new Tiger("Mia","South Africa",2020,Color.YELLOW);

        Elefant bim= new Elefant("Bimbo","Kongo",2010);
        Elefant dana=new Elefant("Dana","Tanzania", 2013);


        System.out.println(dana.name+" elefant from  " + dana.kind);
        System.out.println(don.name +" bear" + " b.y."+ don.year+ " was removed to another box");



    }
}
