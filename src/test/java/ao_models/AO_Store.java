package ao_models;

public class AO_Store {
    private long id;
    private int quantity;
    private String shipDate;
    private AO_Status status;

    public AO_Store(int quantity, String shipDate, AO_Status status) {
        this.quantity = quantity;
        this.shipDate = shipDate;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getShipDate() {
        return shipDate;
    }

    public AO_Status getStatus() {
        return status;
    }

    public void setId(long id) {
        this.id = id;
    }
}

//        "complete": true
