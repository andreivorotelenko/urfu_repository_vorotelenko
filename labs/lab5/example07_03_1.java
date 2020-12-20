public class example07_03_1 {
	int n;
	int z;


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