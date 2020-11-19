import java.util.Scanner;

public class example07_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.print("Введите день недели: ");
		String week = in.nextLine();

		System.out.print("Введите номер дня: ");
		int day = in.nextInt();

		System.out.print("Введите номер месяца: ");
		int month = in.nextInt();


		System.out.printf("Привет сегодня %s, %d день %d месяца, чудесный день\n", week , day, month);
		in.close();

	}
}