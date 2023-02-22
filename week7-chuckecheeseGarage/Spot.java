public class Spot {
    private int spotNum;
    private String gpsLocation;
    private int floor;
    private char area;

    private Car carParked;

    void setSpotNum(int spotNum) {
        this.spotNum = spotNum;
    }


    void setCarParked(Car carParked) {
        this.carParked = carParked;
    }

    Car getCarParked() {
        return carParked;
    }

    public String toString() {
        return "Parking spot #: " + spotNum
                + "\nCar in this spot is: " + carParked;
    }
}
