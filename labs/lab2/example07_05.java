import java.util.Scanner;

public class example07_05 {
	
	public static void Deep(long number, int step) {
		
		if (number >= 1 && number <= 999) {
			System.out.print( step + " thousand");
			return;
		}
		
		number /= 1000;
		step++;
		Deep(number,step);
	}
	
	public static void main(String[] args) {
		//ввод числа
		Scanner InCMD = new Scanner (System.in);
		System.out.print("Enter number: ");
		long num = InCMD.nextInt();
		int step = 0;
		
		//замер времени начальный
		long startTime = System.currentTimeMillis();
				       
		
		System.out.print("in number " + num + " contains ");
		Deep(num,0);
		
		//замер времени конечный и вывод времени выполнения
		long endTime = System.currentTimeMillis();
		System.out.println("\nExecution time: " + (endTime-startTime) + "ms" );
		}

	}
