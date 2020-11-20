import java.util.Scanner;

public class example07_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.print("Сколько лет: ");
		int age = in.nextInt();
		
		age = 2020 - age;

		in.close();

		System.out.printf("%d год рождения\n", age);
		
	}
}