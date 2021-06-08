package ao_models;

public class AO_Category {
        private long id;
        private String name;

        public AO_Category(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public long getId() {
            return id;
        }
        public String getName() {
            return name;
        }
}

