package hw9daria;

public class Galaxy {
    private String name;
    private String size;
    private int distancefromsun;

    public void printInfo(){
        System.out.println("The name of Galaxy is "+name+" and the size is "+size+". Distance from the Sun is "+distancefromsun);
}
    public Galaxy(String name, String size){
        this.name=name;
        this.size=size;
    }
    public Galaxy(String name, String size, int distancefromsun){
        this.name=name;
        this.size=size;
        this.distancefromsun=distancefromsun;
    }
}
