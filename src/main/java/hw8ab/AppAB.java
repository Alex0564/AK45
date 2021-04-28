package hw8ab;

public class AppAB {
    public static void main(String[]args){

        BrandNames Gucci= new BrandNames();
        Gucci.brandName1="Bag";
        Gucci.brandName2="Shoes";
        Gucci.brandName3="Hat";
        System.out.println(Gucci.brandName3);


        Veggies cucamber= new Veggies();
         cucamber.green="Cucamber";

         Veggies pepper=new Veggies();
         pepper.yellow= "Pepper";

         Veggies tomato=new Veggies();
         tomato.red="Tomato";

         System.out.println(cucamber.green);


         Animal cat= new Animal();
         cat.name= "Zinka";
         cat.color="black";
         cat.age=2;
         cat.fur="Short";
         System.out.println(cat.name);

           cat.meow();






    }
}
