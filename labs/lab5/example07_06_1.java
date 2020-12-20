public class example07_06_1 {
	private int min;
	private int max;


	public example07_06_1 (int a, int b) {
		if (a >= b) {
			min = b; 
			max = a;
		}
		else {
			max = b; 
			min = a;
		}
	}


	public void example07_06_1_void (int a, int b) {
		if (a >= b) {
			min = b; 
			max = a;
		}
		else {
			max = b; 
			min = a;
		}
	}

	public void example07_06_1_void_print () {
		System.out.println("max = " + max + "\n" + "min = " + min);
		
	}

}