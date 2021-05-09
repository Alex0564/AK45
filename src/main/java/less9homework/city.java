package less9homework;

public class city {
    private String name;
    private Double population;
    private String country;
    public city () {}
    public city (String name, Double population, String country) {
        this.name = name;
        this.population = population;
        this.country = country;
    }
    public void setName(String name){this.name = name;}
    public void setPopulation(Double population){this.population = population;}
    public void setCountry(String country) {this.country = country;}
    public String getName (){return name;}
    public String getCountry (){return country;}
    public Double getPopulation (){return population;}

}
