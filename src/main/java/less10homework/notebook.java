package less10homework;

public class notebook extends Page{
    private int pages;
    private int paperdensity;

    public notebook(){}

    public notebook (int pages, String size, int paperdensity){
        super(size);
        this.pages = pages;
        this.paperdensity = paperdensity;
    }
    public void setPages (int pages){this.pages = pages;}
    public void setPaperdensity(int paperdensity){this.paperdensity=paperdensity;}
    public int getPages(){return pages;}
    public int getPaperdensity(){return paperdensity;}
    public void noteInfo (){
        System.out.println(pages + " pages, size "+ getSize() + " and density "+ paperdensity + " g/m2");
    }
}
