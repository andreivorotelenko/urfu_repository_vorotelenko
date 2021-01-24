public class example07_06_01 {
    public static int[] Limit (int[] arr, int lim){

        if (lim > arr.length){
            lim = arr.length;

        }
        int[] ARR = new int [lim];
        for (int i = 0; i < lim; i++){
            System.out.print(arr[i] + " ");
            ARR[i] = arr[i];
        }
        return ARR;
    }
}
