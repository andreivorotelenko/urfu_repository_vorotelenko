class example07_12 {
	static double a = 10.0, b = 4.0, c;

	public static double hyp(double d, double e) {
		d = Math.exp(2*Math.log(d));
		e = Math.exp(2*Math.log(e));
		return e + d;
	}
	
	public static void main(String[] args) {
		System.out.println("катет а=" + a);
		System.out.println("катет b=" + b);
		System.out.println("катет c=" + hyp(a,b));
	}
}
