import java.util.Scanner;

public class example07_04 {

	

	public static void main(String[] args) {
		Scanner InCMD = new Scanner (System.in);

		System.out.print("input one simbol: ");
		double num_doub = InCMD.nextDouble();

		example07_04_1 args_ = new example07_04_1(num_doub);
	}

}

