package life;

public class Wolf extends Carnivores{
    private String kind;


    public Wolf(String place, String kind) {
        super(place);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void printWolf(){
        System.out.println(place + ", " + kind);
    }
}
