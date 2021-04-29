package hw9vk77;

public class Human {
    private String sex;
    private String name;
    private int age;
    private int grouth;

    //reCreate default constructor
    public Human(){}

    //Create full constructor
    public Human(String sex, String name, int age, int grouth ){

        this.age=age;
        this.name=name;
        this.sex=sex;
        this.grouth=grouth;
    }

    //GETer SETer
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSex(String sex){
        this.sex=sex;
    }
    public String getSex() {
        return sex;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setGrouth(int grouth){
        this.grouth=grouth;
    }
    public int getGrouth(){
        return grouth;
    }
    /////END BLOCK OF GETer SETer

    ///Method Printclass()
     public void printClass(){
         System.out.println("Human{" +
                 "sex='" + sex + '\'' +
                 ", name='" + name + '\'' +
                 ", age='" + age + '\'' +
                 ", grouth=" + grouth +
                 '}');
    }


}
