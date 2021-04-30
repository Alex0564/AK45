package inheritance;

public class Parrot extends Animal{
    private Cover cover;

    public Parrot(Gender gender, String color, String weight, int age, Cover cover){
        super(gender, color, weight, age);
        this.cover = cover;
    }
    public Parrot(){}

    public void setCover(Cover cover){
        this.cover = cover;
    }
    public Cover getCover(){
        return cover;
    }
    public void printParrot(){
        System.out.println("Gender = " + gender + ", Color = " + color + ", Weight = " + weight + ", Age = " + age + ", Cover = " + cover);
    }
}
