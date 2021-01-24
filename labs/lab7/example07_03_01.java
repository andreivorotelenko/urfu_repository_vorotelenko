public class example07_03_01 {
    public static void AAA (int ... a){
        int min = a[a.length/2];
        int max = a[a.length/2];
        int mean = 0;

        int i = 0;
        for (i = 0; i< a.length; i++){
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
            mean += a[i];
        }
        mean /=i;
        System.out.println(max+ " "+ min + " "+ mean);

    }
}
