import java.util.Scanner;

public class example07_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.print("Введите имя: ");
		String name = in.nextLine();

		System.out.print("Введите год рождения: ");
		int age = in.nextInt();
		
		age = 2020 - age;

		in.close();

		System.out.printf("Привет %s, тебе %d лет\n", name, age);
		
	}
}