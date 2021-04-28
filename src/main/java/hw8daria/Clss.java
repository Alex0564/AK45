package hw8daria;

public class Clss {
    public static void main (String[]args){
        Book coding = new Book ();
        coding.name="Learn Java";
        coding.Author="Shildt";
        coding.language="English";
        coding.pagenumbers=345;
        coding.rating=5;

        System.out.println(coding.name+" and the rating is "+coding.rating);
        coding.Descr();

        Parfume baccarat = new Parfume ();
        baccarat.Name="Baccarat Rouge 540";
        baccarat.topnotes="wood and musk";
        baccarat.price=540;

        baccarat.Features();

        Country Ukraine = new Country();
        Ukraine.name="Ukraine";
        Ukraine.amountpeople=40;
        Ukraine.continent="Europe";

        Ukraine.D();

    }



}
