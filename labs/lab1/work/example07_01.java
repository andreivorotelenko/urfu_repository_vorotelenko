import java.util.Scanner;

public class example07_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.print("Input name:");
		String name = in.nextLine();

		System.out.print("Input firsname:");
		String firsname = in.nextLine();

		System.out.print("Input patronymic:");
		String patronymic = in.nextLine();

		System.out.printf("Hello %s %s %s \n", firsname , name, patronymic);
		in.close();

	}
}