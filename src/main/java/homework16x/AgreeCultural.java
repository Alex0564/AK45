package homework16x;

public class AgreeCultural {
    private String nameOfCulture;
    private int fieldsNumber;

    public AgreeCultural(String nameOfCulture, int fieldsNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldsNumber = fieldsNumber;
    }

    public String getNameOfCulture() {
        return nameOfCulture;
    }

    public int getFieldsNumber() {
        return fieldsNumber;
    }

    public String toString(){
        return nameOfCulture+" "+fieldsNumber;
    }

}
