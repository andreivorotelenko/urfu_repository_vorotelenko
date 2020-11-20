import java.util.Scanner;

public class example07_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.print("Введите месяц: ");
		String month = in.nextLine();

		System.out.print("Введите день: ");
		int day = in.nextInt();
		
		in.close();

		System.out.printf("Месяц %s,  содержит %d дней\n", month, day);
		

	}
}