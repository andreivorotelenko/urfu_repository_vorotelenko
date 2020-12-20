import java.util.Scanner;

public class example07_05 {

	

	public static void main(String[] args) {
		Scanner InCMD = new Scanner (System.in);

		System.out.print("input one num: ");
		int num1 = InCMD.nextInt();

		System.out.print("input two num: ");
		int num2 = InCMD.nextInt();

		example07_05_1 args_ = new example07_05_1(num1, num2);
		args_.example07_05_1_void (num2, num1);

		args_.example07_05_1_void_print();
	}

}

public class example07_05_1 {
	private int min;
	private int max;


	public example07_05_1 (int a, int b) {
		if (a >= b) {
			min = b; 
			max = a;
		}
		else {
			max = b; 
			min = a;
		}
	}


	public void example07_05_1_void (int a, int b) {
		if (a >= b) {
			min = b; 
			max = a;
		}
		else {
			max = b; 
			min = a;
		}
	}

	public void example07_05_1_void_print () {
		System.out.println("max = " + max + "\n" + "min = " + min);
		
	}

}