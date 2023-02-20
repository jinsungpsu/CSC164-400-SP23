/*
Users: someone who wants to buy stuff, someone selling stuff (Amajawn owner)
User functionality:
- filter through existing products
- add products to cart
-- when adding, they can specify quantity
- check out

Seller functionality:
- add more products to sell
- set prices

potential smaller problems:
- figure out what kind of user (seller/buyer)
- filter function (buyer)
- add products (seller)
- check out (buyer)
- change price (seller)
- add products to cart (buyer)

 */
import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    static int numItemsForSale = 0; // I am kind of cheating here... don't tell anyone

    public static void main(String[] args) {
        launchAmajawn();
    }

    static void launchAmajawn() {
        /*
        data:
            prices
            quantity (buyer)
            user names?? (buyer and seller)
            products to add (seller)
         */

        final int MAX_NUM_PRODUCTS=5;
        double[] price = new double[MAX_NUM_PRODUCTS];
        int numItemsForSale = 0;
        // {4.79, 1.50}
        String[] name = new String[MAX_NUM_PRODUCTS];
        // {"milk", "cookies"}
        int[] quantity = new int[MAX_NUM_PRODUCTS];
        // {0, 0}

        String user = chooseUserType();

        if (user.equals("seller")) { // in java, this is user == "seller"
            sellerFunctions(price, name);
        } else if (user.equals("buyer")){
            buyerFunctions(price, name, quantity);
        } else {
            System.out.println("System error, invalid user type!");
        }
    }

    static String chooseUserType() {
        System.out.println("\n#### welcome to the AmaJawn Administrative menu #####");
        System.out.println("#### If you are a buyer, and see this menu, contact tech support! ####");
        System.out.println("1: Seller Menu");
        System.out.println("2: Buyer Menu");
        System.out.println("Enter choice (1-2): ");
        String user = "";
        int input;
        do {
            input = keyboard.nextInt();
            if (input == 1) {
                user = "seller";
            } else if (input == 2) {
                user = "buyer";
            }
        } while (input != 1 && input != 2);

        return user;
    }

    static void buyerFunctions(double[] price, String[] name, int[] quantity) {
        System.out.println("\nBuyer menu.");
    }

    static void sellerFunctions(double[] price, String[] name) {
        while(true) {
            System.out.println("Seller menu");
            System.out.println("1: Add an item for sale.");
            System.out.println("2: View all products for sale.");
            System.out.println("Enter choice (1-2): ");

            int choice = keyboard.nextInt();

            switch(choice) {
                case 1:
                    // add
                    addProductToInventory(price, name);
                    break;
                case 2:
                    // view
                    viewInventory(price, name);
                    break;
                default:
                    // wrong
            }
        }
    }

    static void viewInventory(double[] price, String[] name) {
        System.out.println("\n### all items for sale! ###");
        for (int i = 0; i < numItemsForSale; i++) {
            System.out.println(name[i] + " " + price[i]);
        }
    }

    static void addProductToInventory(double[] price, String[] name) {
        System.out.println("Enter name of product: ");
        String productName = keyboard.next(); // one word for now...

        System.out.println("Enter price of product: ");
        double productPrice = keyboard.nextDouble();

        name[numItemsForSale] = productName;
        price[numItemsForSale] = productPrice;

        numItemsForSale++;
    }


}
