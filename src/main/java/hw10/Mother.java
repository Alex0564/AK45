package hw10;

    public class Mother {
    protected String name;
    protected String lastName;
    protected int year;


    public Mother(){

    }

        public Mother(String name, String lastName, int year) {
            this.name = name;
            this.lastName = lastName;
            this.year = year;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastName;
        }

        public void setLastname(String lastname) {
            this.lastName = lastname;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }


