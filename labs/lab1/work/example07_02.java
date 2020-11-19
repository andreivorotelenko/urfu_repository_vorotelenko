import java.util.Scanner;

public class example07_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.print("Input name: ");
		String name = in.nextLine();

		System.out.print("Input age: ");
		int age = in.nextInt();


		System.out.printf("Привет %s твой возраст %d, родился в %d году\n", name , age, 2020-age);
		in.close();

	}
}