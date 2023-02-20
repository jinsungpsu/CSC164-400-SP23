public class ExamReview {
    public static void main(String[] args) {
        /*
        Given an array {1,2,3,4,5}
        Can you add up all the even numbers, write a method that returns the sum
         */
        int[] arr ={1,2,3,4,5};
        // even is if value%2 == 0
        int sum = addAllEvens(arr);
        System.out.println(sum);
        System.out.println(addAllEvens(arr));

        int[][] arr2 = {
                {1,2,3},
                {-1, 0, -5},
                {9, -10, -78}
        };
        // print the sum of all negative numbers (write a method!  return the sum)

        System.out.println(sumAllNegatives(arr2));

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f'};
        // write a method that returns true if the letter 'c' is found within the array
        // false if it is not found...

        char findLetter = 'c';
        boolean someValue = containsLetter(letters, findLetter);

        if (containsLetter(letters, 'g')) {
            System.out.println("The letter g does NOT exist in there!");
        } else {
            System.out.println("Yes, the letter g exists in that array!");
        }
    }

    static boolean containsLetter(char[] arr, char findChar) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findChar)
                return true;
        }
        return found;
    }

    static int addAllEvens(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                sum+=arr[i];
        }
        return sum;
    }

    static int sumAllNegatives(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0)
                    sum += arr[i][j];
            }
        }
        return sum;
    }
}
