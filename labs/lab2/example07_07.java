//для проверки есть файл example07_07.txt
import java.util.Scanner;

public class example07_07 {

	public static void main(String[] args) {
		
		//ввод числа
		Scanner InCMD = new Scanner (System.in);
		System.out.print("Enter number: ");
		int num = InCMD.nextInt();
		
				
		//замер времени начальный
		long startTime = System.currentTimeMillis();
						       
			
		System.out.print("number " + num + " is criterion = ");
		
		if (num % 5 == 2 && num % 7 == 1){
			System.out.print("true");
		}else {
			System.out.print("false");
		}

		
				
		//замер времени конечный и вывод времени выполнения
		long endTime = System.currentTimeMillis();
		System.out.println("\nExecution time: " + (endTime-startTime) + "ms" );
	}
}
