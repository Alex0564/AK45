package UmidaLesson10HWEnums;

public class Sunscreen {
    public String types;
    public int size;
    public SPF[] spf;

    public Sunscreen(String types, int size, SPF[] spf) {
        this.types = types;
        this.size = size;
        this.spf = spf;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public SPF[] getSpf() {
        return spf;
    }

    public void setSpf(SPF[] spf) {
        this.spf = spf;
    }
}
