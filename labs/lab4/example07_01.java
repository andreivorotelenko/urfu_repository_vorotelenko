import java.util.Scanner;

public class example07_01 {

	public static void main(String[] args) {

		for (int i = 0; i<=10; i++) {
			
			for (int q = 0; q <= 15; q++) {
				if (q == 0 || i == 0 || i == 10 || q == 15){
					System.out.print(".");
				}else System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");		
 
	}

}
