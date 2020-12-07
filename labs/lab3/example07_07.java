
public class example07_07 {

	public static void main(String[] args) {
		
        
		String arr[] = new String [10];

		long startTimeGlobal = System.currentTimeMillis();
		arr[0] = "a";
		arr[1] = "c";
		arr[2] = "e";
		arr[3] = "g";
		arr[4] = "i";
		arr[5] = "k";
		arr[6] = "m";
		arr[7] = "o";
		arr[8] = "q";
		arr[9] = "s";
	
		
		for (int i = 0; i <= 9; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		for (int i = 9; i >= 0; i--){
			System.out.print(arr[i] + " ");
		}
		long endTimeGlobal = System.currentTimeMillis();
        System.out.println("\nGlobal Execution time: " + (endTimeGlobal-startTimeGlobal) + "ms" );

	}

}
