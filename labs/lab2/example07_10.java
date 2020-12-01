package lab2;

import java.util.Scanner;

public class example_7_10 {
	public static int step = 0;
	public static boolean switch_ = false;
	
	public static void translate (int number, int step) {
		int num = 0;
		if ((number < 8)) {
			return;
		}else {
			num = number % 8;
			number /= 8;
			step ++;
			translate (number, step);
			if (switch_ == false) {
				System.out.println(num);
				switch_ = true;
			}
			}
		}
	
	public static void main(String[] args) {
		
		//ввод числа
		Scanner InCMD = new Scanner (System.in);
		System.out.print("Enter number: ");
		int num = InCMD.nextInt();

				
		//замер времени начальный
		long startTime = System.currentTimeMillis();
						       
		translate (num, step);
				
		//замер времени конечный и вывод времени выполнения
		long endTime = System.currentTimeMillis();
		System.out.println("\nExecution time: " + (endTime-startTime) + "ms" );
	}
}
