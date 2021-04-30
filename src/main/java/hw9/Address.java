package hw9;

public class Address {
    private int number;
    private String name;
    private int index;

    public Address(int number, String name, int index){
        this.number = number;
        this.name = name;
        this.index = index;
    }
    public Address(){}

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public void printInfo(){
        System.out.println((number+" "+name+", "+index));
    }

    }

