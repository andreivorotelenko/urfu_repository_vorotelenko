import java.util.Scanner;

public class example07_02 {

	public static void main(String[] args) {
		Scanner InCMD = new Scanner (System.in);
		System.out.print("Input day: ");
		String day = InCMD.next();
		
		switch (day){
			case "понедельник":
			case "Monday":
			case "monday":
			case "Понедельник":
		System.out.print(day + " = ");
				System.out.print(1);
				break;
				
			case "вторник":
			case "Tuesday":
			case "tuesday":
			case "Вторник":
		System.out.print(day + " = ");
				System.out.print(2);
				break;

			case "среда":
			case "Среда":
			case "Wednesday":
			case "wednesday":
		System.out.print(day + " = ");
				System.out.print(3);
				break;

			case "четверг":
			case "Четверг":
			case "Thursday":
			case "thursday":
		System.out.print(day + " = ");
				System.out.print(4);
				break;

			case "пятница":
			case "Пятница":
			case "Friday":
			case "friday":
		System.out.print(day + " = ");
				System.out.print(5);
				break;

			case "суббота":
			case "Суббота":
			case "Saturday":
			case "saturday":
		System.out.print(day + " = ");
				System.out.print(6);
				break;
			
			case "воскресенье":
			case "Воскресенье":
			case "Sunday":
			case "sunday":
		System.out.print(day + " = ");
				System.out.print(7);
				break;
			
			default:
				System.out.print("Введенное слово должно " +
								 "быть понедельник или вторник");
		}

	}

}

