package Com.bridgelabz.basics.Assignmentday5;

import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        n1 = sc.nextInt();
        System.out.println("Enter division by number : ");
        n2 = sc.nextInt();

        int quotient = n1 / n2;
        int remainder = n1 % n2;
        System.out.println("After division the quotient and remainder are: ");
        System.out.println("The quotient is " + quotient);
        System.out.println("The remainder is " + remainder);

    }
}
