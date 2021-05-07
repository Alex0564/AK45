package HWTM84_Less12;

public class Motherboard implements ISockets,IRam{
    private String brand;
    private String socket;
    private String ram;

    public Motherboard(String brand, String socket, String ram) {
        this.brand = brand;
        this.socket = socket;
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public void ram() {

    }

    @Override
    public void Socket1151() {

    }

    @Override
    public void SocketAM4() {

    }
}
