package hw10;

public  class Son extends Mother{
    private Subjects hobby;


    public Son(String name, String lstName, int year, Subjects hobby) {

        super(name, lstName, year);
        this.hobby = hobby;

    }

    public Subjects getHobby() {
        return hobby;
    }

    public Son(Subjects hobby) {
        this.hobby = hobby;
    }
}






