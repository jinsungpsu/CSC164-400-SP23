public class Product extends Object{
    private String name;
    private double price;
    private int qty;

    public Product() {
        System.out.println("Making a product!");
    }

    void addMoreToInventory() {
        System.out.println("Adding one more product!");
        qty++;
    }

    int getQty() {
        return qty;
    }

    void setQty(int qty) {
        this.qty = qty;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    public String toString() {
        String output = "";

        output += "This is a product.";
        output += "\nThe price is: $" + price;
        output += "\nName of product: " + name;
        //output += "\nAuthor: " + author;

        return output;
    }


}
