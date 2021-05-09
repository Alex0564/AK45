package lesson15ExceptionsStatics;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class App {
    public static void main(String[] args) {
        List<List<String>> matrix = new ArrayList<>();
        List<String>innerMatrix = new ArrayList<>();
        matrix.add(innerMatrix);
        matrix.get(0).add("xx");
        System.out.println(matrix);

    }
}
