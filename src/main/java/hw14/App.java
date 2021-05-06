package hw14;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        HashMap<String,String> capitalCities = new HashMap<String , String>();
        capitalCities.put("Rome","Italy");
        capitalCities.put("Moscow","Russia");
        capitalCities.put("Kyiv","Ukraine");
        capitalCities.put("Paris","France");

        capitalCities.replace("Rome","Italy","China");
        System.out.println(capitalCities);

        capitalCities.remove("Rome","China");
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("Kyiv"));

        for (String key : capitalCities.keySet() ){
            System.out.println(key);
        }

        for (String value : capitalCities.values()){
            System.out.println(value);
        }

        for (Map.Entry<String , String> entry : capitalCities.entrySet()){
            System.out.println(entry);
        }
        //////////////////////////////////////////////////////////////////////

        HashMap<Integer,String> personAge = new HashMap<Integer,String>();
        personAge.put(18,"Bob");
        personAge.put(37,"Steve");
        personAge.put(20,"Helen");
        personAge.put(22,"Bill");
        System.out.println(personAge);

        ///////////////////////////////////////////////////////////////////////

//        HashMap<Name,LastName> person = new HashMap<Name, LastName>();
//        person.put(new Name(),new LastName());
//        person.put(new Name(),new LastName());
//
//
//
//        System.out.println(person.size());

        ///////////////////////////////////////////////////////////////////////



    }
}
