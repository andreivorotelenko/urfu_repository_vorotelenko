import java.util.Scanner;

public class example07_02 {

	public static void main(String[] args) {
		Scanner InCMD = new Scanner (System.in);
		System.out.print("Input day: ");
		String day = InCMD.next();
		System.out.print(day);
		
		switch (day){
			case "понедельник":
			case "Monday":
			case "monday":
			case "Понедельник":
				System.out.println(" " + 1);
				break;
				
			case "вторник":
			case "Tuesday":
			case "tuesday":
			case "Вторник":
				System.out.println(" " + 2);
				break;

			case "среда":
			case "wednesday":
			case "Wednesday":
			case "Среда":
				System.out.println(" " + 3);
				break;

			case "четверг":
			case "thursday":
			case "Thursday":
			case "Четверг":
				System.out.println(" " + 4);
				break;

			case "пятница":
			case "friday":
			case "Friday":
			case "Пятница":
				System.out.println(" " + 5);
				break;

			case "суббота":
			case "saturday":
			case "Saturday":
			case "Cуббота":
				System.out.println(" " + 6);
				break;

			case "воскресенье":
			case "sunday":
			case "Sunday":
			case "Воскресенье":
				System.out.println(" " + 7);
				break;
			default:
				System.out.print("Введенное слово должно " +
								 "быть от понедельник до воскресенье");
		}

	}

}
