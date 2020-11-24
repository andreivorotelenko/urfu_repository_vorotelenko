//к данной программе идет текстовый документ for_example07_03
//для быстрой проверки значений

import java.util.Scanner;

public class example07_03 {
	public static void main(String[] args) {

        //ввод числа
		Scanner InCMD = new Scanner (System.in);
        System.out.print("Enter number: ");
        int num = InCMD.nextInt();

        //замер времени начальный
        long startTime = System.currentTimeMillis();
       
        System.out.print("Сriterion = ");
        if (num % 4 == 0 && num < 10) {
           System.out.print("true");
        }else {
            System.out.print("false");
        }
            
        //замер времени конечный и вывод времени выполнения
        long endTime = System.currentTimeMillis();
        System.out.println("\nExecution time: " + (endTime-startTime) + "ms" );
	}
}