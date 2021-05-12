package hw17;
//Life
//        =======================
//
//interface - Life
//
//        in Life
//interface - Fungi
//interface - Bacteria
//interface - Plants
//interface - Animals
//
//        in Animals
//interface Vertebrates
//interface Invertebrates
//
//in Vertebrates
//interface Reptiles
//interface Fish
//interface Amphibians
//interface Birds
//interface Mammals
//
//in Mammals
//class Carnivores
//class Primates
//class Seals
//class Rodents
//class Herbivores
//
//in Carnivores
//class - Lion
//class - Wolf
//
//        in Whales
//class - BlueWhale
//
//
//        create at least one abstract method for each interface
//
//create instances of each class
//
//For example:
//interface Life{
//    void canBreath();
//}
//
//    in the Lion class you can give body to this method like
//public void canBreath(){
//        System.out.println("I can breath!!!!");
//        }

public class App {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.canBreath();

        BlueWhale blueWhale = new BlueWhale();
        blueWhale.haveBackbone();

        Carnivores carnivores = new Carnivores();
        carnivores.weHaveWarmBlood();

        Herbivores herbivores = new Herbivores();
        herbivores.canDie();

        Primates primates = new Primates();
        primates.canMove();

        Rodents rodents = new Rodents();
        rodents.canEat();

        Seals seals = new Seals();
        seals.canBreed();
        Wolf wolf = new Wolf();
        wolf.haveBackbone();
        wolf.canBreath();

    }
}
