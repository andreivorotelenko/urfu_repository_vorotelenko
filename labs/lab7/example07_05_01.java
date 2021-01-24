public class example07_05_01 {
    public static int iter = 0;
    public static int result = 1;
    public void resul (int i, int iter, int result){
        if (iter == i+1 ) {
            System.out.println(result);
            return;
        }
        result = iter * iter + result;
        iter++;
        resul(i,iter,result);
    }
}
