import java.util.Scanner;



public class example07_03 {
	
	//переменные для циклов
	//с первоначальными значениями
	public static long num_f_old = 0;
	public static long num_f = 1;
	public static long num_f_out = 0;
	public static int i = 1;
    
	
	//создание чисел фибы циклом for
	public static void for_ (int step){
		
		//замер времени
        long startTimeLocal = System.currentTimeMillis();

		num_f_old = 0;
		num_f = 1;
		num_f_out = 0;
		
		for (int i = 1 ; i <= step; i++){
			System.out.print(num_f_out + " ");
			num_f_out = num_f + num_f_old;
			num_f_old = num_f;
			num_f = num_f_out;
			if (num_f_out < 0 ){
				System.out.print("\nERROR - переполнение - ERROR\n");
				break;
				
			}
		}
		
		//вывод времени работы
        long endTimeLocal = System.currentTimeMillis();
        System.out.println("\nLocal Execution time: " + (endTimeLocal-startTimeLocal) + "ms\n" );

	}

	//cоздание чисел фибы циклом while
	public static void while_ (int step) {
		//замер времени
        long startTimeLocal = System.currentTimeMillis();

		num_f_old = 0;
		num_f = 1;
		num_f_out = 0;
		i = 1;
		
		while (i<=step){
			System.out.print(num_f_out + " ");
			num_f_out = num_f + num_f_old;
			num_f_old = num_f;
			num_f = num_f_out;
			i++;
			if (num_f_out < 0 ){
				System.out.print("\nERROR - переполнение - ERROR\n");
				break;
				
			}
		}
		
		//вывод времени работы
        long endTimeLocal = System.currentTimeMillis();
        System.out.println("\nLocal Execution time: " + (endTimeLocal-startTimeLocal) + "ms\n" );
	}
	
	//созданчие чисел фибы циклом do while
	public static void do_while_ (int step) {
		//замер времени
        long startTimeLocal = System.currentTimeMillis();
        
		num_f_old = 0;
		num_f = 1;
		num_f_out = 0;
		i = 1;
        
		do {
			System.out.print(num_f_out + " ");
			num_f_out = num_f + num_f_old;
			num_f_old = num_f;
			num_f = num_f_out;
			i++;
			if (num_f_out < 0 ){
				System.out.print("\nERROR - переполнение - ERROR\n");
				break;
				
			}
		}		
		while (i<=step);
		
		//вывод времени работы
        long endTimeLocal = System.currentTimeMillis();
        System.out.println("\nLocal Execution time: " + (endTimeLocal-startTimeLocal) + "ms\n" );
	}
	
	//рекурсивное создание чисел фибы
	public static void recursion_ (int step, int num, int i){
		if (num_f_out < 0 ){//проверка на переполнение 
			//вывод времени работы
	        long endTimeLocal = System.currentTimeMillis();
	        System.out.println("\nLocal Execution time: " + (endTimeLocal-startTimeLocal) + "ms\n" );
	        
			System.out.print("\nERROR - переполнение - ERROR\n");
			return;
			
		}
		if (step - i < 0){//проверка на конечную итерацию
			//вывод времени работы
	        long endTimeLocal = System.currentTimeMillis();
	        System.out.println("\nLocal Execution time: " + (endTimeLocal-startTimeLocal) + "ms\n" );
	        
			return;
			
		}else if ( i == 0){//первая итерация
			
			//замер времени
			long startTimeLocal = System.currentTimeMillis();
	        
			num_f_old = 0;
			num_f = 1;
			num_f_out = 0;
			step -= i;
			i++;
			
		}else {//основное действо
			
			System.out.print(num_f_out + " ");
			num_f_out = num_f + num_f_old;
			num_f_old = num_f;
			num_f = num_f_out;
			i++;
		}
		recursion_ (step, num, i);
		
	}
	
	public static void main(String[] args) {
		
		
		Scanner InCMD = new Scanner (System.in);
		
		//ввод количества шагов
        System.out.print("Input step: ");
        int step = InCMD.nextInt();
        //int step = 10000;
        
        //выбор цикла
        System.out.print("\nSelected option:\nFOR = 0\t\tDO_WHILE = 2\nWHILE = 1\tRECURSION = 3\n\t ALL = 4\n\nInput number function = ");
        int num = InCMD.nextInt();
        //int num = 4;
        
        long startTimeGlobal = System.currentTimeMillis();

        switch (num) {
        	case 0:
        		System.out.print("numbers Fibo is FOR:\n\t ");
        		for_(step);
        		break;
        		
        	case 1:
        		System.out.print("numbers Fibo is DO_WHILE:\n\t");
        		do_while_(step);
        		break;
        		
        	case 2:
        		System.out.print("numbers Fibo is WHILE");
        		while_(step);
        		break;
        		
        	case 3:
        		System.out.print("numbers Fibo is RECURSION");
        		recursion_ (step, 0, 1);
        		break;
        		
        	case 4:
        		System.out.print("numbers Fibo is ALL:\n\n");
        		for_(step);
        		do_while_(step);
        		while_(step);
        		recursion_ (step, 0, 0);
        		break;
        		
        	default :
        		System.out.print("ERROR - unreal option");
        }
        
        long endTimeGlobal = System.currentTimeMillis();
        System.out.println("\nGlobal Execution time: " + (endTimeGlobal-startTimeGlobal) + "ms" );
	}
}