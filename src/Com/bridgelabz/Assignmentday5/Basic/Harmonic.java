package Com.bridgelabz.basics.Assignmentday5;

import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {

        System.out.println("Enter the number");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double harmonicNumber = 0;
        if (number == 0) {
            System.out.println("Invalid number");
        } else {
            for (int i = 1; i <= number; i++) {
                harmonicNumber += (1.0 / i);
            }
            System.out.println("Harmonic number for " + number + " is : " + harmonicNumber);
        }


    }

}
