package homework.homework14;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        Map<String,String> lakes = new HashMap<>();
        lakes.put("Michigan","USA");
        lakes.put("Ontario","Canada");
        lakes.put("Baikal","Russia");
        lakes.put("Titicaca","Brazil");
        lakes.replace("Titicaca","Peru");
        for (String lakesKey: lakes.keySet()){
                System.out.println("Lake "+lakesKey+" is located in "+lakes.get(lakesKey)+".");
        }
        System.out.println("--------------------------------");

        Map<Integer,String> month = new HashMap<>();
        month.put(1,"January");
        month.put(2,"February");
        month.put(3,"March");
        month.put(4,"April");
        month.put(5,"June");
        month.remove(5);
        for (Map.Entry<Integer,String> pairKeyValue: month.entrySet()){
            System.out.println("The "+pairKeyValue.getKey()+" month is "+pairKeyValue.getValue()+".");
        }
        System.out.println("--------------------------------");

        Map<Person,Hobby> summerCamp = new HashMap<>();
        Person mike = new Person("Mike","Richardson");
        Person steve = new Person("Steve","Garrison");
        Person julia = new Person("Julia","White");
        Person jessica = new Person("Jessica","Parker");
        Hobby football = new Hobby("football");
        Hobby hockey = new Hobby("hockey");
        Hobby golf = new Hobby("golf");
        Hobby snowboarding = new Hobby("snowboarding");
        summerCamp.put(mike,football);
        summerCamp.put(steve,golf);
        summerCamp.put(julia,snowboarding);
        summerCamp.put(jessica,hockey);
        for (Person summerCampKey: summerCamp.keySet()){
            System.out.println(summerCampKey.getName()+" "+summerCampKey.getSurname()+" likes "+summerCamp.get(summerCampKey).getHobby()+".");
        }

    }
}
