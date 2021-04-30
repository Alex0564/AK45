package hw10;

public class CheckingAccount {
    protected String name;
    protected String lastName;
    protected int birthYear;
    protected String address;
    protected Gender gender;
    protected LawfulStatus status;

    public CheckingAccount() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear > 2021 || birthYear < 1900) {
            throw new IllegalArgumentException("Wrong year");
        }
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LawfulStatus getStatus() {
        return status;
    }

    public void setStatus(LawfulStatus status) {
        this.status = status;
    }

    public CheckingAccount(String name, String lastName, int birthYear, String address,
                           Gender gender, LawfulStatus status) {
        this.name = name;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.address = address;
        this.gender = gender;
        this.status = status;


    }
}
