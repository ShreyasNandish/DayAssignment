package Com.bridgelabz.basics.Assignmentday5;

import java.util.Scanner;
public class Swap2number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of B: ");
        int b = sc.nextInt();

        System.out.println("Before swapping numbers: " + a + "  " + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: " + a + "   " + b);

    }
}
