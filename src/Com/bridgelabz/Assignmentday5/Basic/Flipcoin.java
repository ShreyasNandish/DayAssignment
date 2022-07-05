package Com.bridgelabz.basics.Assignmentday5;

import java.util.Scanner;
public class Flipcoin {
    public static void main(String[] args) {

        int head = 0;
        int tail = 0;

        if (Math.random() < 0.5) {
            tail++;
        }else {
            head++;
        }

        System.out.println("\nNumber of tails is " + tail);
        System.out.println("Number of heads is " + head);

        float percentHeads = ((float)head / 2) * 100;
        System.out.println("Percent heads: " + percentHeads + "\n");

        float percentTails = ((float)tail / 2) * 100;
        System.out.println("Percent tails: " + percentTails + "%\n");

    }
}
