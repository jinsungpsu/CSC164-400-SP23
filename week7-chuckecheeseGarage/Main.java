import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        int carsInGarage = 0;

        Spot[] parkingGarage = new Spot[50];
        for (int i = 0; i < parkingGarage.length; i++) {
            parkingGarage[i] = new Spot();
            parkingGarage[i].setSpotNum(i+1);
        }

        for (int i = 0; i < 3; i ++) {
            System.out.println("Park a car. What's the model info: ");
            Car car = new Car();

            String model = keys.nextLine();
            car.setModel(model);

            String damage = keys.nextLine();
            car.setDamageNotes(damage);

            System.out.println("Owner info: ");
            String ownerInfo = keys.nextLine();
            Owner owner = new Owner(ownerInfo);

            owner.setCar(car);

            //parkingGarage[carsInGarage].setCarParked(car);
            parkACar(car, parkingGarage[carsInGarage]);
            carsInGarage++;
        }

        showAllParkedCars(parkingGarage);

    }

    static void showAllParkedCars(Spot[] garage) {
        for (Spot each: garage) {
            if (each.getCarParked() != null)
                System.out.println(each);
        }
    }

    static void parkACar(Car car, Spot spot) {
        spot.setCarParked(car);
    }
}