package Com.bridgelabz.basics.Assignmentday5.FunctionalProgram;

import java.util.Scanner;
public class SumofThreeinteger {
    static void Sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = sc.nextInt();
        int[] Arr = new int[N];
        int found=0;
        int count =0;

        for (int i=0;i<N;i++){
            Arr[i] = sc.nextInt();
        }
        for (int i=0;i<N-2;i++){
            for (int j=i+1;j<N-1;j++){
                for (int k=j+1;k<N;k++){
                    if ((Arr[i]+Arr[j]+Arr[k])==0){
                        System.out.println(Arr[i] +" " +Arr[j]+" "+Arr[k]);
                        found = 1;
                        count++;
                    }
                }
            }
        }
        System.out.println(" The number of distinct triplets are: "+ count);
        if(found == 0){
            System.out.println("not found");
        }
    }

    public static void main(String[] args) {
        Sum();
    }
}
