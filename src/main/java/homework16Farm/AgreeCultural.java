package homework16Farm;

import java.util.List;

public class AgreeCultural {
    private String nameOfCulture;
    private int fieldsNumber;
    private List<AgreeCultural> agreeCulturals;

    public AgreeCultural(List<AgreeCultural> agreeCulturals) {
        this.agreeCulturals = agreeCulturals;
    }

    public AgreeCultural(String nameOfCulture, int fieldsNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldsNumber = fieldsNumber;
        this.agreeCulturals = agreeCulturals;

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

    public List<AgreeCultural> getAgreeCulturals() {
        return agreeCulturals;
    }

    public void setAgreeCulturals(List<AgreeCultural> agreeCulturals) {
        this.agreeCulturals = agreeCulturals;
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
