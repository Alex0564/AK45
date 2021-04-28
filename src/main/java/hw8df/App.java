package hw8df;

public class App {
    public static void main(String[] args) {
        Person mama = new Person();
        mama.name = "Anna";
        mama.lastName="Adams";
        mama.year = 1995;


        Person dad= new Person();
        dad.name= "Adam";
        dad.lastName = "Adams";
        dad.year =1990;

        Person son = new Person();
        son.name = "Sam";
        son.lastName="Adams";
        son.year= 2015;

        Person daughter= new Person();
        daughter.name= "Sonia";
        daughter.lastName="Adams";
        daughter.year= 2020;

        Cat Tom = new Cat();
        Tom.year= 2010;
        Tom.gender = "male";
        Tom.color = "black";


        Cat Milli = new Cat();
        Milli.year = 2020;
        Milli.gender="female";
        Milli.color = "white";

        Book GoldenBook=new Book();
        GoldenBook.editor = "Shalaev";
        GoldenBook.year= 1997;
        GoldenBook.cover= "Hard";

        Book SilverBook= new Book();
        SilverBook.editor= "Samojlov";
        SilverBook.year= 1997;
        SilverBook.cover= "Hard";

        Parfum sample1 = new Parfum();
        sample1.name = "BombShell";
        sample1.author = "VS";
        sample1.size= 100;

        Parfum sample2 = new Parfum();
        sample2.name = "Blue light";
        sample2.author = "Dolce & Gabbana";
        sample2.size= 150;



        GoldenBook.sold();
        SilverBook.sold();




   }
}
