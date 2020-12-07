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
        
        if (MinNumber > MaxNumber){
        	System.out.print("неправильный ввод");
        	return;
        }
        //вывод возможных алгоритмов
        System.out.print("ALGORITMS: \n FOR = 0 \t DO_WHILE = 1 \n WHILE = 2 \n ALL ALGORITMS = 3\n");
        
        //выбор алгоритма
        System.out.print("Input option: ");
        int num = InCMD.nextInt();
        int i = MinNumber;
        long startTimeGlobal = System.currentTimeMillis();

        switch (num) {
        	case 0:
        		System.out.print("numbers Fibo is FOR:\n\t ");
        		for (i = MinNumber; i<= MaxNumber; i++ ){
        			System.out.print(i + " ");
        		}
        		break;
        		
        	case 1:
        		System.out.print("numbers Fibo is DO_WHILE:\n\t");
        		do {
        			System.out.print(i + " ");
        			i++;
        		}while (i <= MaxNumber);
        		break;
        		
        	case 2:
        		System.out.print("numbers Fibo is WHILE");
        		while (i <= MaxNumber){
        			System.out.println(i + " ");
        			i++;
        		}
        		break;
        		
        	case 3:
        		System.out.print("numbers Fibo is ALL:\n\n");
        		
        		for (i = MinNumber; i<= MaxNumber; i++ ){
        			System.out.print(i + " ");
        		}
        		
        		do {
        			System.out.print(i + " ");
        			i++;
        		}while (i <= MaxNumber);
        		
        		while (i <= MaxNumber){
        			System.out.println(i + " ");
        			i++;
        		}
        		break;
        		
        	default :
        		System.out.print("ERROR - unreal option");
        }
        
        long endTimeGlobal = System.currentTimeMillis();
        System.out.println("\nGlobal Execution time: " + (endTimeGlobal-startTimeGlobal) + "ms" );

        
	}

}
