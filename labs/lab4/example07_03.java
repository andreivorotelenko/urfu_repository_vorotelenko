import java.util.Scanner;

public class example07_03 {

	public static void main(String[] args) {
		int str = 10;
		int clm = 15;
		int arr [][] = new int[clm][str];
		for (int i = 0; i<str; i++) {
			
			for (int q = 0; q < clm; q++) {
				if (q == 0 || i == 0 || i == str-1 || q == clm-1){
					arr[q][i] = 2;
					System.out.print("2");
				}else 	System.out.print(" ");
				
			}
			System.out.println(" ");
		}
		System.out.println(" ");		
 
	}

}
