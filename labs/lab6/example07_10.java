import java.util.Arrays;
import java.util.Scanner;

public class example07_10 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner (System.in);
        System.out.print("enter size array: ");
        int num = InCMD.nextInt();

        int [] x = new int [num];

        System.out.println("Исходный массив");

        for (int i=0;i<num ;i++ ) {
            int a = (int) (Math.random()*(200_000_000+1)) - 100_000_000;
            x[i] = a;
            System.out.print(x[i] + " ");
        }

        long startTime = System.currentTimeMillis();


        example7_10_1 AAA = new example7_10_1();
        int [] print_ar = AAA.TF(x);

        System.out.print("\nMAX = " + print_ar[1] + "\nMIN = " + print_ar[0] );

        long endTime = System.currentTimeMillis();

        System.out.println("\nTotal execution time: " + (endTime-startTime) + "ms" );
    }
}
