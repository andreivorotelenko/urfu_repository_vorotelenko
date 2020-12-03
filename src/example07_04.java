import java.util.Scanner;

public class example07_04 {

	public static void main(String[] args) {
		
		Scanner InCMD = new Scanner (System.in);
		
		//ввод минимального значения
        System.out.print("Input minimal number: ");
        int MinNumber = InCMD.nextInt();
        System.out.print("\n");
        
        //ввод максимальнго значения
        System.out.print("Input maximal number: ");
        int MaxNumber = InCMD.nextInt();
        System.out.print("\n");
        
        
        //вывод возможных алгоритмов
        System.out.print("ALGORITMS: \n FOR = 0 \t DO_WHILE = 2 \n WHILE = 1 \t RECURSION = 4 \n ALL ALGORITMS = 5\n");
        
        //выбор алгоритма
        System.out.print("Input option: ");
        int num = InCMD.nextInt();
        
        long startTimeGlobal = System.currentTimeMillis();

        switch (num) {
        	case 0:
        		System.out.print("numbers Fibo is FOR:\n\t ");
        //		for_(step);
        		break;
        		
        	case 1:
        		System.out.print("numbers Fibo is DO_WHILE:\n\t");
        	//	do_while_(step);
        		break;
        		
        	case 2:
        		System.out.print("numbers Fibo is WHILE");
        		//while_(step);
        		break;
        		
        	case 3:
        		System.out.print("numbers Fibo is RECURSION");
        		//recursion_ (step, 0, 1);
        		break;
        		
        	case 4:
        		System.out.print("numbers Fibo is ALL:\n\n");
        		//for_(step);
        		//do_while_(step);
        		//while_(step);
        		//recursion_ (step, 0, 0);
        		break;
        		
        	default :
        		System.out.print("ERROR - unreal option");
        }
        
        long endTimeGlobal = System.currentTimeMillis();
        System.out.println("\nGlobal Execution time: " + (endTimeGlobal-startTimeGlobal) + "ms" );

        
	}

}
