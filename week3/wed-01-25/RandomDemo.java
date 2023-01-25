import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        final int LOW = 0;
        final int HIGH = 22;
        for (int i =0; i < 5; i++) {
            int randomScore = (int) (Math.random() * HIGH - LOW);
            System.out.println(randomScore);
            if (randomScore == 22) {
                System.out.println("uh oh!");
                break;
            }
        }

        // solve it using OOP
        System.out.println("#### Random class ###");

        Random rng = new Random();
        rng.setSeed(100);

        for (int i = 0; i < 50; i++) {
            System.out.println(rng.nextInt(0, 22));
        }
    }
}
