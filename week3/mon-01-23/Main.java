import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*double num1 = 1.2;
        double num2 = 1.3;
        double num3 = 1.9;
        String name = "Johnny";

        System.out.printf("Name: %s\nNum1: %.2f\nNum2: %.2f\nnum3: %.2f", name, num1, num2, num3);
*/
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch(choice) {
            case 1:
                // add
                System.out.println("I'm adding stuff y'all!");
                break;
            case 2:
                // subtracting
                System.out.println("I'm subtracting stuff y'all!");
                break;
            case 3:
                // whatever
            case 4:
                // whatever else
                System.out.println("This is cases 3 OR 4");
                break;
            default:
                // everything else

        }

        char repeat = 'y';

        if (repeat == 'y' || repeat == 'Y') {

        }

        switch(repeat) {
            case 'y':
            case 'Y':
                // do stuff
                break;
        }

        char thing = '5';
        switch(thing) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("That is a number");
                break;
            case 'a':
            case 'b':
                System.out.println("You got a letter!");
        }
    }
}
