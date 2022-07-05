package Com.bridgelabz.basics.Assignmentday5.FunctionalProgram;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;
public class Distance {
    static void dist()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x");
        int x=sc.nextInt();
        System.out.println("enter y");
        int y=sc.nextInt();
        double distance=Math.sqrt(x * x + y * y);
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);
    }

    public static void main(String[] args) {
        dist();
    }
}
