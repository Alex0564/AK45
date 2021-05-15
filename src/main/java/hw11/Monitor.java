package hw11;

import hw9daria.Brand;

public class Monitor {
    private String brand;
    private String model;
    private int diag;

    // setters
    public void setBrand (String Brand){
        this.brand=brand;
    }
    public void setModel (String Model){
        this.model=model;
    }
    public void setDiag (int diag){
        this.diag=diag;
    }

    // getters
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getDiag(){
        return diag;
    }

//full constructor
    public Monitor(String brand, String model, int diag) {
        this.brand = brand;
        this.model = model;
        this.diag = diag;
    }
}
