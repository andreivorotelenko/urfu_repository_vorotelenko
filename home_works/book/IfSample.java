class IfSample {
	public static void main (String args[]) {
		int x,y;
		
		x = 10;
		y = 20;
		
		if (x < y) System.out.println("х меньше у");

		x = x * 2;
		if (x == y) System.out.println("х равно у");

		x = x * 2;
		if (x > y) System.out.println("х теперь больше у");

		//этот оператор не будет ничего выводить
		if (x == y) System.out.println("вы не увидите этого");
	}
}
