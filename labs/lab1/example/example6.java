class example6 {
	static double a = 10.0, b = 4.0, c;
	
	public static double hyp() {
		return c = Math.sqrt(a * a + b * b);
	}
	
	public static void main(String[] args) {
		System.out.println("катет а=" + a);
		System.out.println("катет b=" + b);
		System.out.println("катет c=" + hyp());
	}
}
