import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // printSum(1.5, 3);
        double sum = sum(3.5, 10);
        System.out.println("the sum is " + sum(1.5, 2.5));
        double compelxCalculatio = 1.5*10-5+sum(1.5,3.7);

        double input1 = keyboard.nextDouble();
        sum(input1, keyboard.nextDouble());
    }

    static void playingWithStrings() {
        String word = "Hello World";

        String subWord = word.substring(1, 5);

        char letter = word.charAt(0);
        int length = word.length();

        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
        }
    }

    static void application() {
        application();
        printMenu();

        if (keyboard.nextInt() == 1) {
            printCalculatorMenu();
            System.out.println("What ya wanna do?");
            switch(keyboard.nextInt()) {
                case 1:
                    // addition
                    // get input
                    printSum(getDoubleInput(-10, 10), getDoubleInput(-10, 10));
                    // add them up
                    // ouput
                    break;
                case 2:
                    // subraction
                    break;
                default:
                    // you messed up

            }
        }
    }

    /*
    get input from the user (type double)
    check that > -X and < +X
     */
    static double getDoubleInput(double low, double high) {
        /*double low; // also gets initialized
        double high;*/

        double input;
        do {
            System.out.println("Enter a number");
            input = keyboard.nextDouble();
        } while (input < low || input > high);

        return input;
    }

    static void printSum(double op1, double op2) {
        System.out.println("Sum: " + sum(op1, op2));
    }

    static double sum(double op1, double op2) {
        return op1 + op2;
    }

    /*
    
     */
    static void printMenu() {
        System.out.println("\n\nMENU!");
        System.out.println("1. run program!");
        System.out.println("2. exit");
    }
    
    static void printCalculatorMenu() {
        System.out.println("\n1. add");
        System.out.println("2: subtract");
    }
}
