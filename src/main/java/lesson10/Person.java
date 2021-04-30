package lesson10;

import java.util.Locale;

public class Person {
    private String name;
    private String lastName;
    private int year;


    public Person() {

        public Person(String name, String lastName, int year){
            this.name = name;
            this.lastName= lastName;
            this.year = year;

        }

        public void setName(String name) {
            this.name = name;

        }
        public String getName() {
            return name.toUpperCase();
        }
    }
}
