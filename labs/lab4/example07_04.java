import java.util.Scanner;

public class example07_04 {

	public static void main(String[] args) {
		//переменные для массива		
		int str = 10;
		int clm = 15;
		int arr [][] = new int[clm][str];

		for (int i = 0; i<str; i++) {
			
			for (int q = 0; q < clm; q++) {
				if (q == 0 || (i == str-1 && q<i )){
					arr[q][i] = 3;
					System.out.print("3");
				
				}else if (i == q) {
					System.out.print("3");
								
				}else 	System.out.print(" ");
				
			}
			System.out.println(" ");
		}
		System.out.println(" ");		
 
	}

}
