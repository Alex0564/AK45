package less14homework;

public class Surnames {
    public Surnames() {
    }

    @Override
    public String toString() {return "\nlastname: " + lastname;}

    private String lastname;
    public Surnames(String lastname) {this.lastname = lastname;}
    public String getLastname() {return lastname;}
    public void setLastname(String lastname) {this.lastname = lastname;}

}
