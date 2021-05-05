package homework13op;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList<String> dogs = new ArrayList<String>();
        dogs.add("Golden Retriever");
        dogs.add("German Shephard");
        dogs.add("Beagle");
        dogs.add("Rottweiler");
         System.out.println(dogs);


        String oldValue = dogs.set(3,"Rottweiler");
        System.out.println(oldValue);
        System.out.println(dogs);
        oldValue =dogs.remove(0);
        System.out.println(oldValue);
        System.out.println(dogs);
        dogs.remove("Rottweiler");
        System.out.println(dogs);

        for (String dog: dogs) {
            System.out.println(dog);
        }

        for (int i=0; i<dogs.size(); i++){
            System.out.println(dogs.get(i));
        }

    }
}
