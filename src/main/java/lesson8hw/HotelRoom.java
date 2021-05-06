package lesson8hw;

public class HotelRoom {
    public String name;
    public String view;
    public String bedSize;
    public int beds;

    public void RoomInfo() {
        System.out.println("Hotel Room Category = " + this.name + "\nRoom view = " + this.view + "\nBeds Quantity = " + this.beds + "\nBed Color = " + this.bedSize);
    }
}
