public class example07_07_01 {
    public static int[] CHAR (char [] ar) {
        int [] int_ar = new int [ar.length];
        for (int i = 0; i < ar.length; i++){
            int_ar [i] = (int) ar [i];
        }
        return int_ar;

    }
}
