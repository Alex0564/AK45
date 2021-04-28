package hw8daria;

public class Clss {
    public static void main (String[]args){
        Book coding = new Book ();
        coding.name="Learn Java";
        coding.Author="Shildt";
        coding.language="English";
        coding.pagenumbers=345;
        coding.rating=5;

        Book cooking = new Book();
        cooking.name="Tasty Life";
        cooking.rating=4;
        cooking.pagenumbers=567;
        cooking.Author="Mary James";

        System.out.println(coding.name+" and the rating is "+coding.rating);
        coding.Descr();
        cooking.Descr();

        Parfume baccarat = new Parfume ();
        baccarat.Name="Baccarat Rouge 540";
        baccarat.topnotes="wood and musk";
        baccarat.price=540;

        Parfume cassiopea = new Parfume();
        cassiopea.Name= "Cassiopea";
        cassiopea.topnotes="sweet amber and vanilla";
        cassiopea.price=400;

        baccarat.Features();
        cassiopea.Features();

        Country Ukraine = new Country();
        Ukraine.name="Ukraine";
        Ukraine.amountpeople=40;
        Ukraine.continent="Europe";

        Ukraine.D();

        Phone iphone = new Phone();
        iphone.make="Apple";
        iphone.model="iPhone11";
        iphone.color="white";
        iphone.year=2021;
        iphone.price=1200;

        iphone.K();



    }



}
