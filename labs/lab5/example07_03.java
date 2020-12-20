import java.util.Scanner;

public class example07_03 {

	

	public static void main(String[] args) {
		example07_03_1 args_ = new example07_03_1();
		args_.AAA ();
		
		example07_03_1 args_1 = new example07_03_1(1);
		args_.AAA ();

		example07_03_1 args_2 = new example07_03_1(1,2);
		args_.AAA ();
	}

}

public class example07_03_1 {
	int n;
	int z;

	public static void AAA () {
		System.out.println("this is method");
	}


	public example07_03_1 () {
		System.out.println("no args");
	}

	public example07_03_1 (int a) {
		n = a;
		System.out.println("one args" + a);
	}

	public example07_03_1 (int a, int b) {
		n = a;
		z = b;
		System.out.println("two args" + a + " " + b);
	}
}