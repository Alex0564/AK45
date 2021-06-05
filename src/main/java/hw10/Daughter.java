package hw10;

public class Daughter extends Mother{
    public Subjects hobby;
    public Daughter() {
    }

    public Daughter(String name, String lastName, int year, Subjects hunting) {
        super(name,lastName, year);
        this.hobby=hobby;
    }

    public Subjects getHobby()
    {return hobby;}


    public void setHobby(Subjects hobby) {
        this.hobby = hobby;
    }


}
