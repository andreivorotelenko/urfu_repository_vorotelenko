import java.util.Scanner;

public class example07_01 {

	private static char noname;

	//метод присваивающий значение полю
	private static void InChar (){
		//ввод величины массива
		//сохранит только первый вводимый символ
		Scanner InCMD = new Scanner (System.in);
		System.out.print("input string: ");
		noname = InCMD.next().charAt(0);
		System.out.println("Simbol = " + noname);
		
	}

	private static int ReturnIntNoname () {
		return (int) noname;
	}

	//выполнение всех методов
	//вывод в консоль символа и кода символа
	public static void main(String[] args) {
		InChar();
		System.out.println("Code one simbol = " + ReturnIntNoname());
	}

}
