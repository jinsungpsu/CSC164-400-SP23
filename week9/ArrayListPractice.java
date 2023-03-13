import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> stuff = new ArrayList<>();

        stuff.add(1);
        stuff.add(2);
        stuff.add(3);

        if (stuff.contains(4)) {
            System.out.println("Found the number 4!");
        }

        ArrayList<Animal> zoo = new ArrayList<>();

        Animal animal = new Animal("dog");
        zoo.add(animal);
        zoo.add(new Animal("cat"));

        for (int i = 0; i < zoo.size(); i++) {
            System.out.println(zoo.get(i));
        }

        for (Animal each: zoo) {
            System.out.println(each);
        }



        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        Animal[] zoo2 = new Animal[3];
        zoo2[0] = animal;
        zoo2[1] = new Animal("giraffe");
    }
}
