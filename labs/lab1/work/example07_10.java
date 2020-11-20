import java.util.Scanner;

public class example07_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.print("I число: ");
		int num1 = in.nextInt();


		System.out.print("II число: ");
		int num2 = in.nextInt();

		in.close();
		System.out.printf("сумма чисел %d и %d = ",num1,num2);
		System.out.printf("%d \n",num1+num2);
		System.out.printf("разность чисел %d и %d = ",num1,num2);
		System.out.printf("%d",num1-num2);
	}
}