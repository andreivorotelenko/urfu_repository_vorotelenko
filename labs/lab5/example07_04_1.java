public class example07_04_1 {
	int n;
	char z;
	double b;

	public example07_04_1 (double d) {
		System.out.println(d);


		n = (int) d;
		z = (char) n;
		System.out.println(n);



		b = (  d -  n) * 100;
		n = (int) b;
		System.out.println(z);
		System.out.println(n);

	}
}