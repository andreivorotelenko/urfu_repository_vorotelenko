import java.util.Scanner;

public class example07_02 {

	public static void main(String[] args) {

		for (int i = 0; i<=10; i++) {
			
			for (int q = 0; q <= 15; q++) {
				if (q == 0 || (i == 10 && q<i )){
					System.out.print(".");
				
				}else if (i == q) {
					System.out.print(".");
								
				}else 	System.out.print(" ");
				
			}
			System.out.println(" ");
		}
		System.out.println(" ");		
 
	}

}
