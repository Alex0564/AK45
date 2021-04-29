package HWTM84_Less9;

public class Drivers {
    private String name;
    private String lastName;
    private String id;
    private String phone;

    public void setDrivers(String name, String lastName, String id, String phone){
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.phone = phone;
    }
    public String getName(){
        return name;
    }
    public void printInfo(){
        System.out.println("Name= "+name+", Lastname= "+lastName+", ID= "+id+", Phone= "+phone);
    }
}

