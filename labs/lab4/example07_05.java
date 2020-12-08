
//алгоритм долгий, так как сначала 
//создается массив потом разворачивается
import java.util.Scanner;

public class example07_05 {

	public static void main(String[] args) {

		//ввод величины массива
		Scanner InCMD = new Scanner (System.in);
		System.out.print("столбцы: ");
		int str = InCMD.nextInt();
		
		System.out.print("строки: ");
		int clm = InCMD.nextInt();

		//начальный замер времени		
		long startTimeGlobal = System.currentTimeMillis();
		
		//создание массива
		System.out.println("БЫЛО:");
		int arr [][] = new int[clm][str];
		for (int i = 0; i<clm; i++) {
			
			for (int q = 0; q < str; q++) {
				arr[i][q] = (int) (Math.random()*(200_000+1)) - 100_000;
				System.out.print(arr[i][q] + " ");			
			}
			System.out.println(" ");
		}
		System.out.println(" ");	


		//разворот массива массива
		int arr1 [][] = new int [clm][str];
		for (int i = 0; i<str; i++) {
			
			for (int q = 0; q < clm; q++) {
				arr1[q][i] = arr[q][i];
				System.out.print(arr1[q][i] + " ");			
			}
			System.out.println(" ");
		}
		System.out.println(" ");	
		
		//конечный замер времени		
		long endTimeGlobal = System.currentTimeMillis();
	        System.out.println("\nGlobal Execution time: " + (endTimeGlobal-startTimeGlobal) + "ms" );
	
 
	}

}
