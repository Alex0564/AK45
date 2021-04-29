package homework9x;

public class CountryInfo {
    private String countryName;
    private String capitalName;
    private int population;

    public CountryInfo(String countryName, String capitalName, int population) {
        this.countryName = countryName;
        this.capitalName = capitalName;
        this.population = population;
    }


    public CountryInfo() {
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public String getCountryName() {
        return countryName;
    }


    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }
    public String getCapitalName() {
        return capitalName;
    }


    public void setPopulation(int population) {
        this.population = population;
    }
    public int getPopulation() {
        return population;
    }


    public void printInfo() {
        System.out.println("Info about Country:" + "\nName: " + countryName + "\nCapital: " + capitalName + "\nPopulation: " + population);
    }


}
