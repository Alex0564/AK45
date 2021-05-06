package hw14a;

public class weight {
    private String weight;

    public weight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "weight{" +
                "weight='" + weight + '\'' +
                '}';
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
