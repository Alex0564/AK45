package hw14;

public class Climate {
    private String type;
    private String winter;
    private String summer;

    public Climate(String type, String winter, String summer) {
        this.type = type;
        this.winter = winter;
        this.summer = summer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWinter() {
        return winter;
    }

    public void setWinter(String winter) {
        this.winter = winter;
    }

    public String getSummer() {
        return summer;
    }

    public void setSummer(String summer) {
        this.summer = summer;
    }
}
