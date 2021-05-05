package homework13ET;

import java.util.ArrayList;
import java.util.List;

public class Family {
    public static void main(String[] args) {
        List<String> family = new ArrayList<String>();
        family.add("brother");
        family.add("sister");
        family.add("mother");
        family.add("father");
        family.add("sister in law");
        family.add("new child");
        family.remove("sister in law");

        for (int i=0; i<family.size();i++){
            System.out.println(family.get(i));
        }

        family.add("one more child");
        family.add("brother in law");
        family.add("twins");
        family.add("new sister in law");

        System.out.println(family);
        System.out.println(family.size());

    }
}
