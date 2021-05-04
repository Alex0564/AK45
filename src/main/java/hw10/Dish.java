package hw10;

public class Dish {
    private String name;
    private Ingredient [] ingredients;

    public Dish(String name, Ingredient[] ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public Dish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }
}
