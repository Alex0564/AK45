package constructor;

public class Phone {
    private String brandPhone;
    private int modelPhone;
    private int yearPhone;

    public Phone(String brandPhone, int modelPhone, int yearPhone){
        this.brandPhone = brandPhone;
        this.modelPhone = modelPhone;
        this.yearPhone = yearPhone;
    }

    public Phone(){}

    public void setBrandPhone(String brandPhone){
        this.brandPhone = brandPhone;
    }
    public void setModelPhone(int modelPhone){
        this.modelPhone = modelPhone;
    }
    public void setYear(int yearPhone){
        this.yearPhone = yearPhone;
    }
    public void printPhone(){
        System.out.println("Brand = " + brandPhone + "\nModel = " + modelPhone + "\nYear = " + yearPhone);
    }
}
