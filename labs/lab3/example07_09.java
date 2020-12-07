import java.util.Scanner;
import java.util.Arrays;

public class example07_09 {

	public static void main(String[] args) {
		//ввод величины массива
		Scanner InCMD = new Scanner (System.in);
		System.out.print("Size array: ");
		int num = InCMD.nextInt();
		
        
		long startTimeGlobal = System.currentTimeMillis();
		int arr[] = new int [num];
		int arr_min_indx[] = new int [num];
		int arr_max_indx[] = new int [num];
		int min_indx = 0;
		int max_indx = 0;
		int min = 2000;
		int max = 0;

		for (int i = 0; i < num; i++){
			int a = (int) (Math.random() * (5)) - 2;
			arr[i] = a;
			System.out.print(arr[i] + " ");
			if (a > max) {
				max = a;
			}

			if (a < min) {
				min = a;
			}
		}

		System.out.print("\nMIN = " + min + "\nINDEX = " );
		for (int i = 0; i < num; i++){
			if (arr[i] == min){
				System.out.print(i+1 + " ");
			}
		}

		System.out.print("\nMAX = " + max + "\nINDEX = ");
		for (int i = 0; i < num; i++){
			if (arr[i] == max){
				System.out.print(i+1 + " " );
			}
		}	
		long endTimeGlobal = System.currentTimeMillis();
        System.out.println("\nGlobal Execution time: " + (endTimeGlobal-startTimeGlobal) + "ms" );

	}

}
