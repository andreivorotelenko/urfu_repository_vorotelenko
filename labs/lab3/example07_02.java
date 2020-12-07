import java.util.Scanner;

public class example07_02 {

	public static void main(String[] args) {
		Scanner InCMD = new Scanner (System.in);
		System.out.print("Input day: ");
		String day = InCMD.next();
		System.out.print(day);
		
		switch (day){
			//case "понедельник":
			//case "Monday":
			case "monday":
			//case "Понедельник":
				System.out.print(1);
				break;
				
			//case "вторник":
			//case "Tuesday":
			case "tuesday":
			//case "Вторник":
				System.out.print(2);
				break;
			//default:
				//System.out.print("Введенное число должно " +
					//			 "быть от 1 до 7");
		}

	}

}
