import java.util.Scanner;

public class example07_02 {

	private static char SimbolOne;
	private static char SimbolTwo;

	public static void In_ () {
		Scanner InCMD = new Scanner (System.in);
		System.out.print("input one simbol: ");
		SimbolOne = InCMD.next().charAt(0);
		System.out.print("input two simbol:");
		SimbolTwo = InCMD.next().charAt(0);
		System.out.println("---");
		for (int i = (int) SimbolOne; i<= (int) SimbolTwo ; i++ ) {
			System.out.println("SIMBOL = " + (char) i );
		}
	}

	public static void main(String[] args) {
		In_ ();
	}

}