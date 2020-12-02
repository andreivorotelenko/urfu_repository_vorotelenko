import java.util.Scanner;

public class example07_01 {

	public static void main(String[] args) {
		Scanner InCMD = new Scanner (System.in);
		System.out.println("Enter number ");
		int num = InCMD.nextInt();
		
		switch (num){
			case (1):
				System.out.print("Понедельник");
				break;
			case (2):
				System.out.print("Вторник");
				break;
			case (3):
				System.out.print("Среда");
				break;
			case (4):
				System.out.print("Четверг");
				break;
			case (5):
				System.out.print("Пятница");
				break;
			case (6):
				System.out.print("Суббота");
				break;
			case (7):
				System.out.print("Воскресенье");
				break;
			default:
				System.out.print("Введенное число должно " +
								 "быть от 1 до 7");
		}
		 
	}

}
