
public class example07_08 {

	public static void main(String[] args) {
		
        
		String arr[] = new String [20];

		long startTimeGlobal = System.currentTimeMillis();
		arr[0] = "B";
		arr[1] = "C";
		arr[2] = "D";
		arr[3] = "F";
		arr[4] = "G";
		arr[5] = "H";
		arr[6] = "J";
		arr[7] = "K";
		arr[8] = "L";
		arr[9] = "M";
		arr[10] = "N";
		arr[11] = "P";
		arr[12] = "Q";
		arr[13] = "R";
		arr[14] = "S";
		arr[15] = "T";
		arr[16] = "V";
		arr[17] = "W";
		arr[18] = "X";
		arr[19] = "Z";	
		
		for (int i = 0; i < 20; i++){
			System.out.print(arr[i] + " ");
		}
		long endTimeGlobal = System.currentTimeMillis();
        System.out.println("\nGlobal Execution time: " + (endTimeGlobal-startTimeGlobal) + "ms" );

	}

}
