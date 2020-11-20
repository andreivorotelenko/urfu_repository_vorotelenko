class example07_12 {
	static double a = 10.0, b = 4.0, c;

	public static double hyp() {
		a = Math.exp(2*Math.log(a));
		b = Math.exp(2*Math.log(b));
		return c = a + b;
	}
	
	public static void main(String[] args) {
		System.out.println("катет а=" + a);
		System.out.println("катет b=" + b);
		System.out.println("катет c=" + hyp());;
	}
}
