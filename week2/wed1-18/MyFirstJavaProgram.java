import java.lang.Math;
import java.util.Scanner;
public class MyFirstJavaProgram {
    public static void main(String[] args) {

        String name = "john";

        // interned strings
        // equals method in String class
        if (name == "john") {

        }
        if (name.equals("John")) {

        }

        int doubl = (int)Math.pow(10, 9);

        System.out.print("print not println");
        System.out.println("hi");
        System.out.println("bye");
        int age;

        Scanner keys = new Scanner(System.in);

        // cin >> number;
        name = keys.next();
        age = keys.nextInt();

        // to get a character
        char grade;
        String gradeString = keys.next();
        grade = gradeString.charAt(0);
        grade = keys.next().charAt(0);

        double gpa = keys.nextDouble();

        float average = keys.nextFloat();

        boolean graduating = keys.nextBoolean();

        // cout << number;
        System.out.println(age);
        System.out.println(graduating);
        System.out.println(gpa);
        System.out.println(5.5);
        System.out.println(true);
        System.out.println("Name is: " + name + "\n" + "GPA: " + gpa);
        System.out.println((1)/2);

    }
}
