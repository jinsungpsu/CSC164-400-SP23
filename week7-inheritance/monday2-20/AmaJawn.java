import java.sql.SQLOutput;

public class AmaJawn {
    public static void main(String[] args) {
        //Product item1 = new Product();

        //Book item2 = new Book();

        GraphicNovel item3 = new GraphicNovel();
        item3.addMoreToInventory();

        System.out.println(item3.toString());

    }
}
