package hw17a;

public class App {
    public static void main(String[] args) {

         /*Homework 17a

    interface - Life

    in Life:
        interface - Fungi
        interface - Bacteria
        interface - Plants
        interface - Animals

    in Animals:
        interface Vertebrates
        interface Invertebrates

    in Vertebrates:
        interface Reptiles
        interface Fish
        interface Amphibians
        interface Birds
        interface Mammals

    in Mammals:
        abstract class Carnivores
        abstract class Primates
        abstract class Seals
        abstract class Rodents
        abstract class Whales
        abstract class Herbivores

    in Carnivores:
        class - Lion
        class - Wolf

    in Whales:
        class - BlueWhale

    * Create at least one abstract method for each interface;
    For example:
            interface Life{
	        void canBreath(); }

    * Create instances of each class;
        in the Lion class you can give body to this method like
        public void canBreath(){
        System.out.println("I can breath!!!!");
        }
         */

        //Class Lion object instantiation:

        Lion barbaryLion = new Lion("Barbary Lion");

        System.out.println();
        System.out.println("What is about a Barbary Lion?");
        barbaryLion.internalSkeleton();
        barbaryLion.heterotrophs();
        barbaryLion.reproduce();
        barbaryLion.breath();
        barbaryLion.aggressive();

        System.out.println(barbaryLion.toString());
        System.out.println("******************************");

        //Class Wolf object instantiation:

        Wolf greyWolf = new Wolf("Grey Wolf");

        System.out.println("What is about a Grey Wolf?");
        greyWolf.heterotrophs();
        greyWolf.warmBlooded();
        greyWolf.eat();
        greyWolf.breath();
        greyWolf.aggressive();
        System.out.println(greyWolf.toString());
        System.out.println("***************************");

        //Class BlueWhale object instantiation:

        BlueWhale pygmyWhale = new BlueWhale("Pygmy Whale");

        System.out.println("What is about a Pygmy Whale?");
        pygmyWhale.sleep();
        pygmyWhale.die();
        pygmyWhale.heterotrophs();
        pygmyWhale.sing();
        pygmyWhale.breath();


    }

}
