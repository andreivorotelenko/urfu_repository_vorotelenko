import java.util.Scanner;

public class example07_05 {
    public static int res = 0;

    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        System.out.print("Введите предел расчетов ");
        int num = InCMD.nextInt();

        for (int i=1 ; i<=num; i++){
            res = i * i + res;
        }
        System.out.println("Результат цикла = " + res);

        System.out.print("Результат рекурсии = " );

        example07_05_01 arg_ = new example07_05_01();
        arg_.resul(num,0, 0);
        }
}
