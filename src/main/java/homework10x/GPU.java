package homework10x;

public class GPU extends ComputerComponents {
    private String videoMemorysize;
    private int CudaCores;

    public GPU(String name, String brand, String model, int year, String videoMemorysize, int CudaCores) {
        super(name, brand, model, year);
        this.videoMemorysize = videoMemorysize;
        this.CudaCores = CudaCores;
    }

    public String getVideoMemorysize() {
        return videoMemorysize;
    }

    public int getCudaCores() {
        return CudaCores;
    }


}
