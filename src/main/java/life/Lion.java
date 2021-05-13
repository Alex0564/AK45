package life;

public class Lion extends Carnivores{
    private String food;


    public Lion(String place, String food) {
        super(place);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
    public void printLion(){
        System.out.println(place + ", " + food);
    }

    @Override
    public void breathe() {
        System.out.println("I can breathe");

    }
}
