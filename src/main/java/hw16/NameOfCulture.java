package hw16;

public class NameOfCulture {
    private String nameOfCulture;

    public NameOfCulture(String nameOfCulture){
        this.nameOfCulture = nameOfCulture;
    }

    public String getNameOfCulture(){
        return nameOfCulture;
    }

    @Override
    public String toString(){
        return nameOfCulture;
    }
}
