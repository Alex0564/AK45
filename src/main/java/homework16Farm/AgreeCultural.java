package homework16Farm;

import java.util.List;

public class AgreeCultural {
    private String nameOfCulture;
    private int fieldsNumber;
    private List<AgreeCultural> agreeCulturals;

    public AgreeCultural(String nameOfCulture, int fieldsNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldsNumber = fieldsNumber;

    }
    public String printAgreeCulturals() {
        return nameOfCulture+" on the field # "+fieldsNumber;
    }
    @Override
    public String toString() {
        return printAgreeCulturals();
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
}
