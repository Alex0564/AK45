package hw8vk77;

public class Weapon {
    public String guntype;
    public int bulletamount;
    public Double bulletsize;
    public String gunName;

    public void GetInfo(){
        System.out.println("Gun type:"+this.guntype + " called "+ gunName+" and it has "+bulletamount+" bullets of " +bulletsize+" caliber");
    }
}
