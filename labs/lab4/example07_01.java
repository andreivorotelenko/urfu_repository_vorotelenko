import java.util.Scanner;

public class example07_01 {

	public static void main(String[] args) {
		int colm = 11;
		int srt = 23;

		for (int i = 0; i<=colm; i++) {
			
			for (int q = 0; q <= srt; q++) {
				if (q == 0 || i == 0 || i == colm || q == srt){
					System.out.print(".");
				}else System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");		
 
	}

}
