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

public class example07_05_1 {
	private int n;

	void example07_05_1 () {
		System.out.println("argument = false");
		n = 0;
		System.out.println(n);
	}

	void example07_05_1 (int num) {
		System.out.println("argument = true");
		
		if (num > 100) n = 100;
		else n = num;
		System.out.println(n);
	}

}