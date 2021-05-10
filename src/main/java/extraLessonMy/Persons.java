package extraLessonMy;

    public class Persons {
        private String name;
        private String lastName;
        private int year;

        public Persons(String name, String lastName, int year) {
            this.name = name;
            this.lastName = lastName;
            this.year = year;
        }

        public String getName() {return name;}
        public int getYear() {return year;}
        public String getLastName() {return lastName;}

        @Override
        public String toString() {
            return "name " + name + ", lastName " + lastName + ", year = " + year;}
    }
