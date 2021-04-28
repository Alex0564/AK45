package hw8vk77;

public class Dog {
    public String kind;
    public String color;
    public String size;//big middle small
    public int age;
    public String purpose;
    public String name;
    public String howloudly;

    public void run(){
        System.out.println(this.kind+" " +this.size+" dog with name "+ this.name+ ""+this.purpose +" started running after the suspects.");
    }
    public void hide(){
        System.out.println(this.kind+" " +this.size+" dog with name "+ this.name+ " hidden behind trees");
    }
    public void bark(){
        System.out.println(this.kind+" " +this.size+" dog with name "+ this.name+ " started to bark very "+this.howloudly);
    }


}
