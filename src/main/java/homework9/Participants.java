package homework9;

public class Participants {
    private String name;
    private String title;
    private int age;

    public Participants(String name, String title, int age){
        this.name = name;
        this.title = title;
        this.age = age;
    }
    public Participants(String name, String title){
        this.name = name;
        this.title = title;
    }
    public Participants(){}

    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void printInfo(){
        System.out.println("Participant{" +
                "name='" + name + '\'' +
                ", title ='" + title + '\'' +
                ", age=" + age +
                '}');
    }
}
