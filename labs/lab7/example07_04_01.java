public class example07_04_01 {
    public int a = 1;

    public void resul (int i){
        if (i <= 0){
            System.out.println("рекурсия= " + a);
            return;
        }
        a *= i;
        i-=2;
        resul(i);
    }
}
