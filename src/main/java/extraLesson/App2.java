package extraLesson;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<List<String>> matrix = new ArrayList<>();
        List<String>innerMatrix = new ArrayList<>();
        matrix.add((innerMatrix));
        matrix.get(0).add("XX");
        matrix.get(0).add("YY");
        System.out.println(matrix);
    }
}
