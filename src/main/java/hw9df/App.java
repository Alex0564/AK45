package hw9df;

public class App {
    public static void main(String[] args){
        Worker stiven= new Worker("Stiven","Stivenson","plumer");

        Worker kay = new Worker("Kay","Adams", "builder");


        Kid small =new Kid("Michael", "Boom",2015,"Sun");
        Kid middle= new Kid("Tim","Frankis",2014,"Ranbow" );
        Kid large = new Kid( "Masha", "Troumm", 2013, "Lions");

        Box broun = new Box ("Apple","KKK", 10);
        Box blue= new Box("Bal","MMM",15);

        Market jony = new Market("Jony Vegan","Old Tree",2324);
        Market walmart= new Market("Walmart", "Wytchwood street", 2001);
        System.out.println(walmart.getName());
        System.out.println(walmart.getStreet());
        System.out.println(walmart.getNumber());

stiven.work();
       blue.lost();
        System.out.println(large.getGroup());
        System.out.println(middle.getName());


        System.out.println(middle.getGroup());



    }

}
