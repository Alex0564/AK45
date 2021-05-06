package hw14a;

public class type {
    private String type;

    @Override
    public String toString() {
        return "type{" +
                "type='" + type + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public type(String type) {
        this.type = type;
    }
}
