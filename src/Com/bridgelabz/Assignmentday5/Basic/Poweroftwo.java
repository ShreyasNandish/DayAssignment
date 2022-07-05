package Com.bridgelabz.basics.Assignmentday5;

import java.util.Scanner;
public class Poweroftwo {
    public static void main(String[] args) {
        int number = 2, i, exponent;
        long power = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the Exponent Value : ");
        exponent = sc.nextInt();

        for (i = 1; i <= exponent; i++) {
            power = power * number;
        }
        System.out.println("\n The result of " + number + " power " + exponent + " = " + power);
    }
}
