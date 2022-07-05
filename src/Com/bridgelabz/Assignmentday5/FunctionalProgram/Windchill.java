package Com.bridgelabz.basics.Assignmentday5.FunctionalProgram;

import java.util.Scanner;
import java.lang.Math;
public class Windchill {

    public static void Wind(){
        int t, v;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temperature:");
        t = sc.nextInt();
        System.out.println("Enter Speed:");
        v = sc.nextInt();

        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Wind chill  = " + w);

    }
    public static void main(String[] args) {
       Wind();
    }

}
