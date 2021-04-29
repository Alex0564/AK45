package hw8;

public class Address {
    public int number;
    public String name;
    public int index;

    public void send(){
        System.out.println("Send the letter by this address:"+number+" "+name+","+" "+index);
    }
}
