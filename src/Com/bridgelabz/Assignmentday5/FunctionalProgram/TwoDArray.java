package Com.bridgelabz.basics.Assignmentday5.FunctionalProgram;

import java.util.Scanner;

public class TwoDArray {
    public static void TwoArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter i: ");
        int i= sc.nextInt();
        System.out.println("enter j: ");
        int j= sc.nextInt();

        int A[][] = new int[i][j];
        for(i=0;i<A.length;i++) {
            for (j = 0; j < A[i].length; j++)
                A[i][j] = sc.nextInt();
        }
        System.out.println("Printing of array");
        for(i=0;i<A.length;i++) {
            for (j = 0; j < A[i].length; j++)
                System.out.println("The array is :"+A[i][j]);
        }
    }

    public static void main(String[] args) {
        TwoArray();
    }
}
