package ArtuomLesson9HW;

public class Sneakers {
    private String Brand;
    private int size;
    private String gender;

    public Sneakers(String brand, int size, String gender) {
        Brand = brand;
        this.size = size;
        this.gender = gender;
    }

    public Sneakers(int size) {
        this.size = size;

    }

    public Sneakers() {
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getBrand() {
        return Brand;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
    public void printClass(){
        System.out.println("Much people like brand " +this.Brand+" I saw people bought size= "+this.size+ " Gender = "+ this.gender);

        printout();
    }

    public void printout(){
        System.out.println("My wife like snikers where Size= "+this.size );
    }
}
