import java.util.*;

public class example07_08 {

	public static void main(String[] args) {

		//ввод величины массива
		Scanner InCMD = new Scanner (System.in);
		System.out.print("input string: ");
		String str = InCMD.nextLine();


		System.out.print("input bias: ");
		int num = InCMD.nextInt();
		num %= 24;


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
		

		//колдунство для создания шифра
		System.out.print("output string: ");
		for (int i = 0; i < str.length(); i++ ) {
			boolean switch_ = false;
			for (int q = 0; q <= 24; q++ ) {
				
				if (ch[i] == alphabet[q]) {
					int buf = (q + num) % 24;
					switch_ = true;
					//System.out.println(buf);
					System.out.print(alphabet[buf]);
					break;
				}
				
			}
			if (switch_ == false) {
				System.out.println("\ninvalid character found\n");
				return;
			}
		}

		System.out.println(" ");

		//вывод (типо) меню
		System.out.println("reverse conversion (y/n): ");
		String byn = InCMD.nextLine();

		switch (byn) {
			case "y":
				System.out.print(str);
				break;
			case "n":
				System.out.print("Ĝis revido");
				break;
			default:
				System.out.println("Vi diras al mi tion, kion mi ne scias");
				break;
		}

		//конечный замер времени		
		long endTimeGlobal = System.currentTimeMillis();
	        System.out.println("\nGlobal Execution time: " + (endTimeGlobal-startTimeGlobal) + "ms" );
	
 
	}

}
