package job1;

public class example07_11 {
    public static void main(String[] args) {
        try {
            System.out.println("0");

            //генерируется ошибки
            throw new NullPointerException("ошибка");

            //обрабатывается ошибки
        } catch (NullPointerException e) {
            System.out.println("1" );

            //этот блок все равно выполняется
        }finally {
            System.out.println("2" );
        }
        System.out.println("3");
    }
}
