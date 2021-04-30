package inheritance;

public class Dog extends Animal{

    public Dog(Gender gender, String color, String weight, int age){
        super(gender, color, weight, age);
    }
    public Dog(){}

    public void printDog(){
        System.out.println("Gender = " + gender + ", Color = " + color + ", Weight = " + weight + ", Age = " + age);
    }
}
