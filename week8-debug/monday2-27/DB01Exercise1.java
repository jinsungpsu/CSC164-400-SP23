/*
Write a Java program to get a number from the user and print whether it is positive or negative.
 */
import java.util.Scanner;
public class DB01Exercise1 {


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System);
        System.out.print("Input number: ");
        int input = in.next();

        if (input > 0)
        {
            System.out.println("Number is positive");
        }
        else if (input <= 0)
        {
            System.out.println("Number is negative");
        }
        else if
        {
            System.out.println("Number is zero");
        }
    }
