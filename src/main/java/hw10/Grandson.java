package hw10;
public class Grandson extends Mother{
    private Subjects hobby;

    public Grandson(Subjects hobby) {
        this.hobby = hobby;
    }

    public Grandson(String name, String lastName, int year, Subjects hobby) {
        super(name, lastName, year);
        this.hobby = hobby;
    }

    public Subjects getHobby() {
        return hobby;
    }

    public void setHobby(Subjects hobby) {
        this.hobby = hobby;
    }
}


