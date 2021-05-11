package ArtuomLesson12HWB;

public class LaptopArt extends  LapTop {

    private String CountryOfMade;

    public LaptopArt(String brand, ArtuomLesson12HWB.Colors colors, int year, String countryOfMade) {
        super(brand, colors, year);
        this.CountryOfMade = countryOfMade;
    }

    public String getCountryOfMade() {
        return CountryOfMade;
    }

    public void setCountryOfMade(String countryOfMade) {
        CountryOfMade = countryOfMade;
    }
    @Override
    public void Donthitthelapttop() {
        System.out.println( brand+" "+Colors+" "+year+ this.CountryOfMade+" This laptop is not a constraction tools  ");

    }// Почему  мне пришлось @Override опировать с класса Laptop? Когда заполняешь эту страницу по порядку @override не возможно вызвать. Или подскажите пожалуйста способ, или что я делаю не так.

    @Override
    public void Donotwasрthelaptopinthesink() {
        System.out.println(brand + " " + Colors + " " + year +this.CountryOfMade+ " This laptop is not designed to work in water");
    }

}



