package homework8;

public class app {
    public static void main(String[] args) {
        animals cat = new animals();
        cat.name = "Cat";
        cat.sleepInDay = 16;
        cat.daysNoFood = 20;

        animals giraffe = new animals();
        giraffe.name = "Giraffe";
        giraffe.sleepInDay = 2;
        giraffe.daysNoFood = 7;

        cat.printInfo();
        giraffe.printInfo();

        beer corona = new beer();
        corona.name = "Corona";
        corona.country = "Mexico";
        corona.volume = 4.5;

        beer heineken = new beer();
        heineken.name = "Heineken";
        heineken.country = "Netherlands";
        heineken.volume = 5;

        corona.getInfo();
        heineken.getInfo();

        mountains mount1 = new mountains();
        mount1.name = "Kilimanjaro";
        mount1.height = 5895;
        mount1.continent = "Africa";

        mountains mount2 = new mountains();
        mount2.name = "Denali";
        mount2.height = 6190;
        mount2.continent = "North America";

        mount1.getInfo();
        mount2.getInfo();

        flowers flower1 = new flowers();
        flower1.name = "roses";
        flower1.color = "red";
        flower1.person = "My sister";

        flowers flower2 = new flowers();
        flower2.name = "chamomiles";
        flower2.color = "white";
        flower2.person = "Sidney";

        flower1.result();
        flower2.result();

    }
}
