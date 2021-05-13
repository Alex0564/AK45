package hw17;

public class App {
    public static void main(String[] args) {
        /*Homework 17

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
        class Carnivores
        class Primates
        class Seals
        class Rodents
        class Whales
        class Herbivores

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

        //Class Carnivores object instantiation:

        Carnivores polarBear = new Carnivores("Felifornia", "Polar Bear");
        System.out.println("*****************************");
        System.out.println(polarBear.toString());
        System.out.println("The following information about Polar Bear:");
        polarBear.heterotrophs();
        polarBear.internalSkeleton();
        polarBear.breath();
        System.out.println("****************");

        //Class Lion object instantiation:

        Lion barbaryLion = new Lion("Feliformia", "Barbary Lion");
        System.out.println(barbaryLion.toString());
        barbaryLion.breath();
        System.out.println("****************");

        //Class Wolf object instantiation:

        Wolf greyWolf = new Wolf("Wolf", "Grey Wolf");
        System.out.println(greyWolf.toString());
        greyWolf.eat();
        greyWolf.internalSkeleton();
        System.out.println("****************************");

        //Class Blue Whales object instantiation:

        BlueWhale pygmyWhale = new BlueWhale("Blue Whale", "Pygmy Whale");
        System.out.println(pygmyWhale.toString());
        pygmyWhale.warm_blooded();
        pygmyWhale.reproduce();
    }
}
