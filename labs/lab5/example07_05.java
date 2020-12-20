import java.util.Scanner;

public class example07_05 {

	

	public static void main(String[] args) {
		Scanner InCMD = new Scanner (System.in);

		System.out.print("input num: ");
		int num = InCMD.nextInt();

		example07_05_1 args_ = new example07_05_1();
		args_.example07_05_1();
		System.out.println("---");
		args_.example07_05_1(num);
	}

}

