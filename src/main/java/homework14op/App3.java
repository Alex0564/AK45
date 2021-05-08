package homework14op;

import java.util.HashSet;
import java.util.Iterator;

public class App3 {
    public static void main(String[] args) {
        HashSet<String> books = new HashSet<>();
        books.add("War and Peace");
        books.add("The Greate Gatsby");
        books.add("Pride and Prejudice");
        books.add("The Lord of the Rings");
        System.out.println(books);

        System.out.println (books.contains("War and Peace"));
        System.out.println(books.remove("The Lord of the Rings"));

         for (String x:books) {
             System.out.println(x);

         }
    }
}
