public class ArrayPassing {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println("Arr[0] before call: " + arr[0]);
        arrChanger(arr);
        System.out.println("Arr[0] after call: " + arr[0]);

        int num = 3;
        System.out.println("Num before call: " + num);
        changer(num);
        System.out.println("Num after call " + num);
    }
    static void changer(int number) {
        number = 5;
    }

    static void arrChanger(int[] nums) {
        nums[0] = 99;
    }
}
