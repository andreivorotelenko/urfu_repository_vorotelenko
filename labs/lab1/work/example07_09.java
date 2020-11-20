import java.util.Scanner;

public class example07_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.print("I число: ");
		int num1 = in.nextInt();

		int num_one_min = num1-1;
		int num_one_pls = num1+1;

		in.close();
		System.out.printf("%d ",num_one_min);
		System.out.printf("%d ",num1);
		System.out.printf("%d ",num_one_pls);
		System.out.printf("%d ",(num_one_min + num1 + num_one_pls)*(num_one_min + num1 + num_one_pls));

		
		
	}
}