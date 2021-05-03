package homework9;

public class Menu {
    private String appetizer;
    private String mainCourse;
    private String dessert;
    private String drink;

    public Menu(String appetizer, String mainCourse, String dessert, String drink) {
        this.appetizer = appetizer;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
        this.drink = drink;
    }

    public Menu () {
        this.appetizer = appetizer;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
        this.drink = drink;
    }


    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }
    public String getAppetizer() {
        return appetizer;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }
    public String getMainCourse() {
        return mainCourse;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
    public String getDessert() {
        return dessert;
    }
}
