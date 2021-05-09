package less10homework;

public class Page {
    protected String type;
    protected String size;
    protected Double interval;
    
    public Page (){}
    
    public Page (String type, String size){
        this.type = type;
        this.size = size;
    }
    public Page (String size){this.size = size;}
    public Page (String type, String size, Double interval){
        this.type = type;
        this.size = size;
        this.interval = interval;
    }
    public void printInfo (){
        System.out.println("Page " + getType() + ", size "+ getSize()+ " has " + getInterval() + " interval");
    }

    public void setType (String type){ this.type = type;}
    public void setSize (String size){ this.size = size;}
    public void setInterval (Double interval){this.interval = interval;}

    public String getType(){return type;}
    public String getSize(){return size;}
    public Double getInterval(){return interval;}

}
