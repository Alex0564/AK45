package hw16vk77;

public class AgriCultural {
    private String nameOfCulture; //Wheet, Soya, Pea
    private int fieldsNumber; //field number

    public AgriCultural() {
    }

    public AgriCultural(String nameOfCulture, int fieldsNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldsNumber = fieldsNumber;
    }

    public String getNameOfCulture() {
        return nameOfCulture;
    }

    public void setNameOfCulture(String nameOfCulture) {
        this.nameOfCulture = nameOfCulture;
    }

    public int getFieldsNumber() {
        return fieldsNumber;
    }

    public void setFieldsNumber(int fieldsNumber) {
        this.fieldsNumber = fieldsNumber;
    }

    public void registerAgriculture(String nameOfCulture, int fieldsNumber){
        this.nameOfCulture = nameOfCulture;
        this.fieldsNumber = fieldsNumber;
    }

    //simple public method - return String result - join fieldsnumber and nameOfCulture
    public String getAgriculture(){

        return  fieldsNumber+"\t"+nameOfCulture;

    }
}
