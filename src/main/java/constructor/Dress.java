package constructor;

public class Dress {
    private String typeDress;
    private String colorDress;
    private int sizeDress;

    public Dress(){}

    public void setTypeDress(String typeDress){
        this.typeDress = typeDress;
    }
    public String getTypeDress(){
        return typeDress;
    }
    public void setColorDress(String colorDress){
        this.colorDress = colorDress;
    }
    public String getColorDress(){
        return colorDress;
    }
    public void setSizeDress(int sizeDress){
        this.sizeDress = sizeDress;
    }
    public int getSizeDress(){
        return sizeDress;
    }
}
