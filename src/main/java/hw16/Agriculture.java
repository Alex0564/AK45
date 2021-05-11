package hw16;

public class Agriculture {
    private String nameOfCulture;
    private int fieldsQuantity;

    public String getNameOfCulture() {
        return nameOfCulture;
    }

    public void setNameOfCulture(String nameOfCulture) {
        this.nameOfCulture = nameOfCulture;
    }

    public int getFieldsQuantity() {
        return fieldsQuantity;
    }

    public void setFieldsQuantity(int fieldsQuantity) {
        this.fieldsQuantity = fieldsQuantity;
    }

    public Agriculture(String nameOfCulture, int fieldsQuantity) {
        this.nameOfCulture = nameOfCulture;
        this.fieldsQuantity = fieldsQuantity;

    }
}
