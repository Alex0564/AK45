package hw11vk77;

public class GraphicAdapter {
    private Brands brand;
    private GraphAModel model;

    public GraphicAdapter(Brands brand, GraphAModel model) {
        this.brand = brand;
        this.model = model;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public GraphAModel getModel() {
        return model;
    }

    public void setModel(GraphAModel model) {
        this.model = model;
    }
}
