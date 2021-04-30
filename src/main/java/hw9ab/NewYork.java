package hw9ab;

public class NewYork {
    private int borough;
    private String urban;
    private String suburban;

    public NewYork(int borough, String urban, String suburban) {
        this.borough = borough;
        this.urban = urban;
        this.suburban = suburban;

    }
    public NewYork(){

    }
    public void setBorough(int borough) {
        this.borough = borough;
    }
    public void setUrb(String urban){
        this.urban=urban;
    }
    public void setSuburban(String suburban){
        this.suburban=suburban;
    }
}
