package HM11;

public class House {
    private Adress adress;
    private Person owner;
    private int bedrooms;
    private int bathbrooms;
    private int year;

    public House(Adress adress, Person owner, int bedrooms, int bathbrooms, int year) {
        this.adress = adress;
        this.owner = owner;
        this.bedrooms = bedrooms;
        this.bathbrooms = bathbrooms;
        this.year = year;
    }

    public Adress getAdress() {
        return adress;
    }

    public Person getOwner() {
        return owner;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathbrooms() {
        return bathbrooms;
    }

    public int getYear() {
        return year;
    }
}
