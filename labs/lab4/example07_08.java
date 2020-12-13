import java.util.*;

public class example07_08 {

	public static void main(String[] args) {

		//ввод величины массива
		Scanner InCMD = new Scanner (System.in);
		System.out.print("input string: ");
		String str = InCMD.nextLine();


		System.out.print("input bias: ");
		int num = InCMD.nextInt();



		//начальный замер времени		
		long startTimeGlobal = System.currentTimeMillis();
		
		//преобразование строки в char
		char[] ch = str.toCharArray();

		//массив символов для проверки и сдвига
		char [] alphabet = {'a', 'b', 'c', 'd' , 'e',
							'f', 'g', 'h', 'i', 'j',
							'k', 'l', 'm', 'n', 'o',
							'p', 'r', 's', 't', 'u',
							'v', 'w', 'x', 'y', 'z'};
		

		

		for (int i = 0; i < str.length(); i++ ) {
			for (int q = 0; q <= 24; q++ ) {
				
				if (ch[i] == alphabet[q]) {
					int buf = q + num;
					System.out.print(alphabet[buf]);
					break;
				}
				
			}
		}


		//конечный замер времени		
		long endTimeGlobal = System.currentTimeMillis();
	        System.out.println("\nGlobal Execution time: " + (endTimeGlobal-startTimeGlobal) + "ms" );
	
 
	}

}
