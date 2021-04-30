package homework10x;

import lesson10x.Subjects;

public class RAM extends ComputerComponents {
    private String size;

    public RAM(String name, String brand, String model, int year, String size) {
        super(name, brand, model, year);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

}
