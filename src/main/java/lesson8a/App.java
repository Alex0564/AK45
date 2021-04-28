package lesson8a;

public class App {
    public static void main(String[] args) {
        Wine BV = new Wine();
        BV.name= "BV";
        BV.grape= "Cabernet Sauvignon";
        BV.color="red";
        BV.type="dry";
        BV.country="USA";
        BV.year=2015;
        BV.county="Napa Valley";

        Wine Picaro = new Wine();
        Picaro.name="Picaro";
        Picaro.grape="Garnacha,Albillo,Temoranillo,Bobal";
        Picaro.color="rose,pink";
        Picaro.type="dry";
        Picaro.country="Spain";
        Picaro.year= 2014;
        Picaro.county="Castillia y Leon";


        Fish Trout = new Fish();
        Trout.name="Trout";
        Trout.water="Fresh,Salt";
        Trout.weight= "Ten Lb";

        Fish Bass= new Fish();
        Bass.name= "Bass";
        Bass.water="Fresh";
        Bass.weight="nine Lb";


        Tshirt Gap = new Tshirt();
        Gap.name="Gap";
        Gap.size="Large";
        Gap.color="burgundy";
        Gap.quantity=212;

        Tshirt JV = new Tshirt();
        JV.name = "JV";
        JV.size = "s,m,l";
        JV.color="Any";
        JV.quantity=1000;




        Phone iPhone = new Phone();
        iPhone.make = "Apple";
        iPhone.model = 12;
        iPhone.color = "White";


        Phone Galaxy = new Phone();
        Galaxy.make="Samsung";
        Galaxy.model=5;
        Galaxy.color="Red";

        Trout.swim();
        Bass.swim();

        iPhone.calling();
        Galaxy.calling();

        Gap.sale();
        JV.sale();

        BV.intoxicates();
        Picaro.intoxicates();


}
}