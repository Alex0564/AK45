package hw10df;

public class Elefant extends Animal{

    private Object mentor;

    public Elefant(String name, String kind, int year) {
        super(name, kind, year);

    }

    @Override
    public String toString() {
        return "Elefant{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", year=" + year +
                ", Gender=" + Gender +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Elefant{" +
//                "name='" + name + '\'' +
//                ", kind='" + kind + '\'' +
//                ", year=" + year +
//                ", Gender=" + Gender +
//                '}';
//    }


    public void setMentor(Mentor[] danaMentor) {
    }
    public Object getMentor() {
        return mentor;
    }
}



