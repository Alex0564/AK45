package lesson10;

import java.util.Locale;

public class Person {
    private String name;
    private String lastName;
    private int year;


    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
            this.name = name;

        }
        public String getName() {
            return name.toUpperCase();
        }
    }

