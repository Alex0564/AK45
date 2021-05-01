package hw10df;

    public class Bear extends Animal{
        private final Color color;

        public Bear(String name, String kind, int year, Color color) {
            super(name, kind, year);
            this.color = color;
        }
    }
