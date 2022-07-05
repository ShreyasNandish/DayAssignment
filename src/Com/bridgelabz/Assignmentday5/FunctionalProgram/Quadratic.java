package Com.bridgelabz.basics.Assignmentday5.FunctionalProgram;

import java.util.Scanner;
import java.lang.Math;
public class Quadratic {
    static void Root() {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ");
        a = sc.nextInt();
        System.out.println("Enter b ");
        b = sc.nextInt();
        System.out.println("Enter c ");
        c = sc.nextInt();

        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1 is " + root1);
            System.out.println("Root 2 is " + root2);
        } else {
            System.out.println("Imaginary roots are present");
        }
    }

        public static void main(String[] args)
        {
            Root();
        }


}
