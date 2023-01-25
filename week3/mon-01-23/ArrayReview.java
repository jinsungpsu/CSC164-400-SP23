public class ArrayReview {
    public static void main(String[] args) {
        int size = 3;
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = 2;
        //arr[2] = 3;

        // this is the same as
        // int[] arr = {1,2,3}

        System.out.println("Regular for loop:");
        for (int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\n\nFor each loop:");

        // for each (range based for loop)
        // cannot use a counter
        for (int each : arr) {
            System.out.print(each + " ");
        }



    }
}
