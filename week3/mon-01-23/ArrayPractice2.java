import java.util.Scanner;

public class ArrayPractice2 {
    /*

    Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.
     */

    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner keys = new Scanner(System.in);

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = keys.nextInt();
        }

        System.out.println("What do you want to look for?");
        int num = keys.nextInt();

        for (int i = 0; i < arr.length; i++ ) {
            if (num == arr[i]) {
                System.out.println("Yup - found that jawn!  " + num);
            }
        }

        char[] words = {'c', 'a', 'b'};
        for (char each: words) {
            if (each == 'e') {
                System.out.println("Found the letter e");
            }
        }


    }
}
