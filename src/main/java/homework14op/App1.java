package homework14op;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        Map<String,String> summerOlympicGames = new HashMap<>();

        summerOlympicGames.put("Moscow", "Soviet Union");
        summerOlympicGames.put("Los Angeles", "USA");
        summerOlympicGames.put("Seoul", "South Korea");
        summerOlympicGames.put("Barcelona", "Spain");

        System.out.println(summerOlympicGames);


        for (Map.Entry<String,String> entry:summerOlympicGames.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        for (String key: summerOlympicGames.keySet()){
            System.out.println(key);
        }
        for (String value: summerOlympicGames.values()) {
            System.out.println(value);
        }
        System.out.println(summerOlympicGames.get("Seoul"));
    }
}
