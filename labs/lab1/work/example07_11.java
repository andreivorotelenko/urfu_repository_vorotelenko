class example07_11 {
	static double a = 10.0, b = 5.0, c;
	
	public static double new_(){
		return c = Math.exp(b*Math.log(a));
	}

	public static double hyp() {
		return c = Math.sqrt(a * a + b * b);
	}
	
	public static void main(String[] args) {
		System.out.println("катет а=" + a);
		System.out.println("катет b=" + b);
		System.out.println("катет c=" + hyp());
		System.out.println("a^b=" + new_());
	}
}
