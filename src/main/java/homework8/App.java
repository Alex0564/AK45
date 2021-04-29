package homework8;

public class App {
    public static void main(String[] args) {
        Animals cat = new Animals();
        cat.name = "Cat";
        cat.sleepInDay = 16;
        cat.daysNoFood = 20;

        Animals giraffe = new Animals();
        giraffe.name = "Giraffe";
        giraffe.sleepInDay = 2;
        giraffe.daysNoFood = 7;

        cat.printInfo();
        giraffe.printInfo();

        Beer corona = new Beer();
        corona.name = "Corona";
        corona.country = "Mexico";
        corona.volume = 4.5;

        Beer heineken = new Beer();
        heineken.name = "Heineken";
        heineken.country = "Netherlands";
        heineken.volume = 5;

        corona.getInfo();
        heineken.getInfo();

        Mountains mount1 = new Mountains();
        mount1.name = "Kilimanjaro";
        mount1.height = 5895;
        mount1.continent = "Africa";

        Mountains mount2 = new Mountains();
        mount2.name = "Denali";
        mount2.height = 6190;
        mount2.continent = "North America";

        mount1.getInfo();
        mount2.getInfo();

        Flowers flower1 = new Flowers();
        flower1.name = "roses";
        flower1.color = "red";
        flower1.person = "My sister";

        Flowers flower2 = new Flowers();
        flower2.name = "chamomiles";
        flower2.color = "white";
        flower2.person = "Sidney";

        flower1.result();
        flower2.result();

    }
}
