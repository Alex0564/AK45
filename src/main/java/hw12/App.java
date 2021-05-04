package hw12;

//        Create an interface and 2 classes which implements it
//        Create 2 objects of each class
//        Assign one object to interface type

public class App {

    public static void main(String[] args) {

        CardboardBox cardboardBox = new CardboardBox(20, 15, 30);
        cardboardBox.type();
//        System.out.println(cardboardBox.mailingSize());
        FoilSealedBox foilSealedBox = new FoilSealedBox(30, 28.5, 43.4);
        foilSealedBox.type();
        PlasticBox plasticBox = new PlasticBox(5.5, 13, 4.3);
        plasticBox.type();

        IBox box1 = new CardboardBox(13, 21.2, 23.4);
        IBox box2 = new FoilSealedBox(45,12,34.5);
        CardboardBox box3 = new PlasticBox(32, 22.5, 56);

        IBox[] boxes ={cardboardBox,box1, foilSealedBox, box2, plasticBox, box3};
        for (IBox box : boxes){
            box.type();
        }


    }
}
