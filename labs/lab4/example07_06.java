//более оптимизированный алгоритм 
//по сравнению с предыдущим
import java.util.Scanner;
import java.util.Arrays;

public class example07_06 {

	public static void main(String[] args) {

		//ввод величины массива
		Scanner InCMD = new Scanner (System.in);
		System.out.print("столбцы: ");
		int str = InCMD.nextInt();
		
		System.out.print("строки: ");
		int clm = InCMD.nextInt();

		//начальный замер времени		
		long startTimeGlobal = System.currentTimeMillis();
		

		
		//выбор удаляемой строки и столбца
		int del_clm = (int) (Math.random()*(clm+1));
		del_clm++;		
		int del_str = (int) (Math.random()*(str+1));
		del_str++;
		System.out.println ("буду удалены " + del_str + " строка и " + del_clm + " столбец");
		del_clm--;
		del_str--;		

		//создание исходного массива 
		System.out.println("БЫЛО:");
		int arr [][] = new int[clm][str];

		//создание выходного массива
		int arr1 [][] = new int[clm][str];

		for (int i = 0; i<clm; i++) {
			
			for (int q = 0; q < str; q++) {
				arr[i][q] = (int) (Math.random()*(200_000+1)) - 100_000;
				if (i == del_clm || q == del_str ){
					arr1[i][q] = 0;
				}else 	arr1[i][q] = arr[i][q];
	
				System.out.print(arr[i][q] + " ");			
			}
			System.out.println(" ");
		}
		System.out.println(" ");	

		System.out.println("СТАЛО:");
		for (int i = 0; i <clm; i++)
	        System.out.println(Arrays.toString(arr1[i]));
		//конечный замер времени		
		long endTimeGlobal = System.currentTimeMillis();
	        System.out.println("\nGlobal Execution time: " + (endTimeGlobal-startTimeGlobal) + "ms" );
	
 
	}

}
