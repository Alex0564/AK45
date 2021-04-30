package less9homework;

public class Student {
    private String firesName;
    private String lastName;
    private String city;
    public Student (){}
    public Student (String firesName, String lastName, String city){
        this.firesName = firesName;
        this.lastName = lastName;
        this.city = city;
    }
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setCity(String city){this.city = city;}
    public void setFiresName(String firesName){this.firesName = firesName;}


}
