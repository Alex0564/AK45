package less12homework;

public class Poland implements Distance{
    public int distanceInKm;
    public Double speed;

    public Poland(int distanceInKm, Double speed) {
        this.distanceInKm = distanceInKm;
        this.speed = speed;
    }

    public int getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    @Override
    public void infAboutDistance() {System.out.println("Distance ="+distanceInKm+" km");}

    @Override
    public double distanceInMile() {return distanceInKm/1.6;}

    @Override
    public double getTime() {return distanceInKm/speed;}


}
