package homework10;

public class Sunflower extends Flower{
    private DeliverTo city;
    private DeliverTo[] deliverTos;

    public void setDeliverTos(DeliverTo[] deliverTos) {
        this.deliverTos = deliverTos;
    }

    public DeliverTo[] getDeliverTos() { return deliverTos; }

    public Sunflower(String name, String color, int price, DeliverTo city){
        super(name, color, price);
        this.city = city;
    }
    public DeliverTo getCity() {
        return city;
    }
    public void setCity(DeliverTo city) {
        this.city = city;
    }
    public String prinCity(){
        return "Avaliable for delivery in "+this.city;
    }
}
