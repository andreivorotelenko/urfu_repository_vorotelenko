import java.util.Scanner;

public class example07_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.print("I число: ");
		int num1 = in.nextInt();
		
		System.out.print("II число: ");
		int num2 = in.nextInt();

		num1 = num1 + num2;

		in.close();

		System.out.printf("сумма = %d\n", num1);
		
	}
}