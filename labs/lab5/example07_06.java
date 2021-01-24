import java.util.Scanner;

public class example07_06 {

	

	public static void main(String[] args) {
		Scanner InCMD = new Scanner (System.in);

		System.out.print("input one num: ");
		int num1 = InCMD.nextInt();

		System.out.print("input two num: ");
		int num2 = InCMD.nextInt();

		example07_06_1 args_ = new example07_06_1();
		args_.example07_06_1_void (num2, num1);

		args_.example07_06_1_void_print();
	}

}
