package hw14vk77;

public class Pet {
    private String petnickname;
    private String pettype;
    private int age;
    private String gender;

    public Pet(String petnickname, String pettype, int age, String gender) {
        this.petnickname = petnickname;
        this.pettype = pettype;
        this.age = age;
        this.gender = gender;
    }

    public String getPetnickname() {
        return petnickname;
    }

    public void setPetnickname(String petnickname) {
        this.petnickname = petnickname;
    }

    public String getPettype() {
        return pettype;
    }

    public void setPettype(String pettype) {
        this.pettype = pettype;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void Bark(){
        System.out.println("Pet "+this.pettype+" with nickname "+ this.petnickname+" and "+this.age+"years old ("+this.gender+") said Hello! ");
    }
}
