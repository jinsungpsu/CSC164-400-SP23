public class Book extends Product{
    private int pages;
    private String author;

    public Book() {
        System.out.println("Printing a book.");
    }

    void addMoreToInventory() {
        System.out.println("Adding one more book!");
        int currQty = super.getQty();
        super.setQty(currQty+1);
    }

    public String toString() {
        String output = "";

        output += super.toString();
        output += "\nAuthor: " + author;

        return output;
    }
}
