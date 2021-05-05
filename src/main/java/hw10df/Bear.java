package hw10df;

    public class Bear extends Animal{
        private final Color color;
        private final Object mentor;

        public Bear(String name, String kind, int year, Object gender, Color color, Object mentor) {
            super(name, kind, year, gender);
            this.color = color;
            this.mentor = mentor;

        }

        @Override
        public String toString() {
            return "Bear{" +
                    "name='" + name + '\'' +
                    ", kind='" + kind + '\'' +
                    ", year=" + year +
                    ", Gender=" + Gender +
                    ", color=" + color +
                    '}';
        }

        public Object getMentor() {
            return mentor;
        }

        public Color getColor() {
            return color;


        }

        }







