import java.util.Scanner;

public class Procedural {
    public static void main(String[] args) {
        // Chuck e cheese
        // valet parking

        Scanner keys = new Scanner(System.in);

        String[] carsParked = new String[50];
        String[] owners = new String[50];
        String car;
        String owner;

        System.out.println("Park a car: ");
        car = keys.nextLine();
        System.out.println("Owner info: ");
        owner = keys.nextLine();

        carsParked[0] = car;
        owners[0] = owner;



    }
}
