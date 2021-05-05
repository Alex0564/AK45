package ArtuomLesson12HW;

import java.util.Arrays;

public class Refrigerator implements IEuropeanElectricPlug, IRefAHAM{

    private String brand;
    private Color color;
    private  int Createyear;
    private int Hight;
    private Engine [] set;


      public Refrigerator(String brand, Color color, int createyear, int hight, Engine[] set) {
          this.brand = brand;
          this.color = color;
          Createyear = createyear;
          Hight = hight;
          this.set = set;
      }

      public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCreateyear() {
        return Createyear;
    }

    public void setCreateyear(int createyear) {
        Createyear = createyear;
    }

    public int getHight() {
        return Hight;
    }

    public void setHight(int hight) {
        Hight = hight;
    }

    public Engine[] getSet() {
        return set;
    }

    public void setSet(Engine[] set) {
        this.set = set;
    }

    public void printInfo() {
        System.out.println("Refrigerator{" +
                "brand='" + brand + '\'' +
                ", color=" + color +
                ", Createyear=" + Createyear +
                ", Hight=" + Hight +
                ", engine=" +Arrays.toString(set)+
                '}');
    }




    @Override
    public void europeanPlug() {
        System.out.println("Hi!It's good refregerator for Europe");


    }

      @Override
      public void caps() {
          System.out.println();

      }

      @Override
   public void keepAHAM() {
        System.out.println("AHAM HRF-1-2016 Энергоёмкость и внутренний объем холодильной техники");

   }

}

