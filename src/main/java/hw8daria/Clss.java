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
    }



}
