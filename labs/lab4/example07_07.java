import java.util.Scanner;
import java.util.Arrays;

public class example07_07 {

	public static void main(String[] args) {

		//ввод величины массива
		Scanner InCMD = new Scanner (System.in);
		System.out.print("столбцы: ");
		int str = InCMD.nextInt();
		
		System.out.print("строки: ");
		int clm = InCMD.nextInt();

		//начальный замер времени		
		long startTimeGlobal = System.currentTimeMillis();
		

		//создание исходного массива 
		System.out.println("БЫЛО:");
		int arr [][] = new int[clm][str];

		//создание выходного массива
		int arr1 [][] = new int[clm][str];

		int invert_num = str - 1;

		for (int i = 0; i<clm; i++) {
			
			for (int q = 0; q < str; q++) {
				arr[i][q] = (int) (Math.random()*(200_000+1)) - 100_000;
								
				if (i %2 == 0) {
					arr1[i][q] = arr[i][q];	
				}else{ 	
					arr1[i][invert_num] = arr[i][q];
					
					invert_num--;
					
					if (invert_num < 0){
						invert_num = str - 1;
					}

				}

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
