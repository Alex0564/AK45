package UmidaLesson14HW;

public class Meal {
    private String type;
    private String dish;


    public Meal(String type, String dish) {
        this.type = type;
        this.dish = dish;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }
}
