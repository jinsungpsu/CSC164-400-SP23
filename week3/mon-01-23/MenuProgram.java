import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        while (true) {
            Scanner keys = new Scanner(System.in);
            menu();

            int choice = keys.nextInt();

            switch (choice) {
                case 1:
                    // buy cookies
                    System.out.println("Cookies!");
                    break;
                case 2:
                    System.out.println("Milk");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void menu() {
        System.out.println("##### AMAjawn MENU #####");
        System.out.println("1: buy a cookie!");
        System.out.println("2: buy milk");
        System.out.println("What jawn you wanna buy? (option 1 or 2): ");
    }
}
