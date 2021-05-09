package lesson14my;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<String>  shape = new ArrayList<>();
        shape.add("Circle");
        shape.add("Triangle");
        shape.add("Square");
        shape.add("Rectangle");
        Iterator <String>iter = shape.iterator();
        while (iter.hasNext()){System.out.println(iter.next());}
    }
}
