import java.util.Scanner;

public class example07_06 {

	public static void main(String[] args) {
		
		Scanner InCMD = new Scanner (System.in);
		
        System.out.print("Input value array: ");
        int num = InCMD.nextInt();
        System.out.print("\n");
        
        if (num <= 0){
        	System.out.print("ввели неправильное значение");
        	return;
        }
        
		int arr[] = new int [num];
		int step = 0;
		
		long startTimeGlobal = System.currentTimeMillis();
		
		for (int i = 0; i <= num *num; i++){
			if (i % 5 == 2){
				arr[step] = i;
				step++;
				System.out.print(i + " ");
				if (step == num -1) {
					break;
				}
			}
		}
		
		long endTimeGlobal = System.currentTimeMillis();
        System.out.println("\nGlobal Execution time: " + (endTimeGlobal-startTimeGlobal) + "ms" );

	}

}
