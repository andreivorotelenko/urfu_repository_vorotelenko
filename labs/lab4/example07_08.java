import java.util.Scanner;
import java.util.Arrays;

public class example07_08 {

	public static void main(String[] args) {

		//ввод величины массива
		Scanner InCMD = new Scanner (System.in);
		System.out.print("столбцы: ");
		int str = InCMD.nextInt();
		
		
		//начальный замер времени		
		long startTimeGlobal = System.currentTimeMillis();
		

		//конечный замер времени		
		long endTimeGlobal = System.currentTimeMillis();
	        System.out.println("\nGlobal Execution time: " + (endTimeGlobal-startTimeGlobal) + "ms" );
	
 
	}

}
