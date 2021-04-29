package hw9vk77;

public class Weapon {
    private String guntype;
    private int bulletamount;
    private Double bulletsize;
    private String gunName;

    //DEFAULT CONSTRUCTOR
    public Weapon(){}

    //FULL CONSTRUCTOR
    public Weapon(String guntype, int bulletamount, Double bulletsize, String gunName) {
        this.guntype = guntype;
        this.bulletamount = bulletamount;
        this.bulletsize = bulletsize;
        this.gunName = gunName;
    }


    public String getGuntype() {
        return guntype;
    }

    public void setGuntype(String guntype) {
        this.guntype = guntype;
    }

    public int getBulletamount() {
        return bulletamount;
    }

    public void setBulletamount(int bulletamount) {
        this.bulletamount = bulletamount;
    }

    public Double getBulletsize() {
        return bulletsize;
    }

    public void setBulletsize(Double bulletsize) {
        this.bulletsize = bulletsize;
    }

    public String getGunName() {
        return gunName;
    }

    public void setGunName(String gunName) {
        this.gunName = gunName;
    }

    public void printInfo(){
        System.out.println("John Doe made his dicision to buy from Weapon store type [" +guntype+"] called ["+ gunName+"] with storing ["+ bulletamount +"] bullets ["+ bulletsize+"] bullet caliber");
    }


}
