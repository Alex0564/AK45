package lesson9;

public class Person {
    private String name;
    private String lastName;
    private int year;

    public void setName(String n) {
        this.name = name;
    }

    public String getName() {   //????why we don't write here in( ) ,why in setter (String) but in d=getter String()?
        return name;
    }

    public void setYear(int year) {
        //year=y;
        if (year > 2021 || year < 1900) {          // ||- OR                //|| - logical OR
            throw new IllegalArgumentException("Wrong year");

        }
        this.year=year;
        }
        public int getYear () {
            return year;
        }
        public void setlastName(String lastName){
        this.lastName=lastName;
        }

    }
