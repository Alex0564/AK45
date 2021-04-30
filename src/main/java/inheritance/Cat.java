package inheritance;

public class Cat extends Animal {
    private String sound;

    public Cat(Gender gender, String color, String weight, int age, String sound){
        super(gender, color, weight, age);
        this.sound = sound;
    }
    public Cat(){}

    public void setSound(String sound){
        this.sound = sound;
    }
    public String getSound(){
        return sound;
    }
    public void printCat(){
        System.out.println("Gender = " + gender + ", Color = " + color + ", Weight = " + weight + ", Age = " + age + ", Sound = " + sound);
    }
}
