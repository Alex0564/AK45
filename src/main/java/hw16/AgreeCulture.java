package hw16;

import java.util.List;

public class AgreeCulture {
    private String nameOfCulture;
    private Integer fieldsNumber;

    public AgreeCulture(String nameOfCulture, Integer fieldsNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldsNumber = fieldsNumber;
    }

    public String getNameOfCulture() {
        return nameOfCulture;
    }

    public Integer getFieldsNumber() {
        return fieldsNumber;
    }

    @Override
    public String toString() {
        return nameOfCulture+" Field number "+fieldsNumber;

    }
}



