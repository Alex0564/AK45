package inheritance;

public class Animal {
    protected String kind;
    protected Gender gender;
    protected String color;
    protected String weight;
    protected int age;

    public Animal(String kind, Gender gender, String color, String weight, int age){
        this.kind = kind;
        this.gender = gender;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public Animal(Gender gender, String color, String weight, int age) {
        this.gender = gender;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public Animal(){}

    public void setKind(String kind){
        this.kind = kind;
    }
    public void setGender(Gender gender){
        this.gender = gender;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setWeight(String weight){
        this.weight = weight;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getKind(){
        return kind;
    }
    public Gender getGender(){
        return gender;
    }
    public String getColor(){
        return color;
    }
    public String getWeight(){
        return weight;
    }
    public int getAge(){
        return age;
    }
    public void printAnimal(){
        System.out.println("Kind = " + kind + ", Gender = " + gender + ", Color = " + color + ", Weight = " + weight + ", Age = " + age);
    }

}
