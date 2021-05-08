package homework14op;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Person mary = new Person("Mary", "Smith", "Boston", 1975);
        Pet dog = new Pet("Attila", "German Shepherd", "male", 7);

        Person harry = new Person("Harry", "Jones", "Atlanta", 2001);
        Pet lizard = new Pet("Coco", "Leopard Geckos", "female", 2);

        Person larry = new Person("Larry", "Batman", "Chicago", 1999);
        Pet humster = new Pet("Jacob","Humster", "male", 1);

        Person julia = new Person("Julia","Land","Hardford", 1989);
        Pet cat = new Pet("Lusia", "Persian cat", "female", 5);


        Map<Person,Pet> personAndPet = new HashMap<>();

        personAndPet.put(mary, dog);
        personAndPet.put(harry, lizard);
        personAndPet.put(larry, humster);
        personAndPet.put(julia, cat);


        String pp;
        for (Map.Entry<Person,Pet> entry:personAndPet.entrySet()){
            pp = "["+entry.getKey().getName()+" "+entry.getKey().getLastName()+" "+entry.getKey().getCity()+"]:"
                    +"["+entry.getValue().getName()+" "+entry.getValue().getBreed()+" "+entry.getValue().getGender()+"]";
            System.out.println(pp);

            }
        }
    }

