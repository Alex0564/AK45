package hw9vk77;

public class Dog {
    private String kind;
    private String color;
    private String size;//big middle small
    private int age;
    private String purpose;
    private String name;
    private String howloudly;


    //CONSTRUCTORS DEFAULT AND FULL
    public Dog(){}
    public Dog(String kind, String color, String size, int age, String purpose, String name, String howloudly) {
        this.kind = kind;
        this.color = color;
        this.size = size;
        this.age = age;
        this.purpose = purpose;
        this.name = name;
        this.howloudly = howloudly;
    }

    //GETer and SETer
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHowloudly() {
        return howloudly;
    }

    public void setHowloudly(String howloudly) {
        this.howloudly = howloudly;
    }
    ///////////////////////////////////END GET SET

    //METHOD
    public void printClass(){
        System.out.println("Dog{" +
                "kind='" + kind + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                " age='" + age + '\'' +
                ", purpose='" + purpose + '\'' +
                ", name='" + name + '\'' +
                ", howloudly=" + howloudly +
                '}');
    }


}
