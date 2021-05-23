package UmidaLesson16HW;

public class Agriculture {
    private String nameOfCulture;
    private  int fieldsNumber;

    public Agriculture(String nameOfCulture, int fieldsNumber) {
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

    @Override
    public String toString() {
        return "nameOfCulture: " + nameOfCulture +
                "\nFieldsNumber: " + fieldsNumber;
    }
}

