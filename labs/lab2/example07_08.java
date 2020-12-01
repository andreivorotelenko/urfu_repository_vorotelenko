


//для проверки есть файл example07_07.txt
import java.util.Scanner;

public class example07_07 {

	public static void main(String[] args) {
		
		//ввод числа

		int num;
		
				
		//замер времени начальный
		long startTime = System.currentTimeMillis();
						       
			
		for (long i = 0 ; i <= 1_000_000; i++) {
		num = (int) i;
		System.out.print("number " + num + " is criterion = ");
		
		if (num % 4 == 0 && num >= 10){
			System.out.print("true");
		}else {
			System.out.print("false");
		}
		System.out.println("");
		}
		
				
		//замер времени конечный и вывод времени выполнения
		long endTime = System.currentTimeMillis();
		System.out.println("\nExecution time: " + (endTime-startTime) + "ms" );
	}
}


