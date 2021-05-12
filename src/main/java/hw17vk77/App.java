package hw17vk77;

public class App {
    /*
    * Life
=======================

interface - Life

in Life
interface - Fungi
interface - Bacteria
interface - Plants
interface - Animals

in Animals
interface Vertebrates
interface Invertebrates

in Vertebrates
interface Reptiles
interface Fish
interface Amphibians
interface Birds
interface Mammals

in Mammals
class Carnivores
class Primates
class Seals
class Rodents
class Herbivores

in Carnivores
class - Lion
class - Wolf

in Whales
class - BlueWhale


create at least one abstract method for each interface

create instances of each class

For example:
interface Life{
	void canBreath();
}

in the Lion class you can give body to this method like
public void canBreath(){
 System.out.println("I can breath!!!!");
}

    * */

    //Let's make a Life!
//1create instances of each class
    //cant create obj of the abstract class
    //
    public static void main(String[] args) {
        Whales greyWhale =new BlueWhale();
        BlueWhale blueWhale =new BlueWhale();
        blueWhale.fountain();
        greyWhale.fountain();
        Carnivores whiteWolf=new Wolf();
        Wolf greyWolf=new Wolf();

        Carnivores africanLion=new Lion();
        Lion mountainLion=new Lion();

        africanLion.canBreath();
        mountainLion.canBreath();

        greyWolf.canReproduct();
        whiteWolf.canReproduct();

        greyWolf.iCanHunt();
        africanLion.iCanRun();

        whiteWolf.canDie();
        mountainLion.canReproduct();
         mountainLion.canEat();

    }





}
