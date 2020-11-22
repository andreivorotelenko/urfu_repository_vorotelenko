import java.util.Scanner;

public class example07_01 {
	public static void main(String[] args) {
		Scanner InCMD = new Scanner (System.in);
        System.out.print("Enter number: ");
        int num = InCMD.nextInt();

        long startTime = System.currentTimeMillis();

        System.out.print("Aliquot 3 = ");

        if (num%3 == 0) {
        	System.out.print("true");
        }else {
        	System.out.print("false");
        }

        long endTime = System.currentTimeMillis();
        System.out.println("\nExecution time: " + (endTime-startTime) + "ms" );
	}
}