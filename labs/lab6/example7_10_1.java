public class example7_10_1 {
    public int [] TF (int [] a){
        int size = a.length - 1;
        int [] ar = new int [2];

        //разделение по медиане в д.с. по нулю
        for (int i = 0; i <= size; i++){
            if (a[i] >= 0){
                ar[1] = a[i];
            }if (a[i] <= 0) {
                ar[0] = a[i];
            }
        }

        return ar;
    }
}