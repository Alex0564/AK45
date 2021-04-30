package homework10x;

public class CPU extends ComputerComponents {
    private int numberOfcores;
    private HyperThreadingCPU smt;

    public CPU(String name, String brand, String model, int year, int numberOfcores, HyperThreadingCPU smt) {
        super(name, brand, model, year);
        this.numberOfcores = numberOfcores;

    }


    public int getNumberOfcores() {
        return numberOfcores;
    }


    public HyperThreadingCPU getSmt() {
        return smt;
    }


}
