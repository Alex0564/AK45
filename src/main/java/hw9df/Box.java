package hw9df;

public class Box {
        private String name;
        public String article;
        private int size;

    public Box( String name, String article,int size) {
        this.name = name;
        this.article = article;
        this.size = size;
    }
        public void lost() {
            System.out.println("Box " + name + " " + article + " was lost");
    }


    }
