import java.util.Scanner;

public class example07_04 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        System.out.print("Введите предел расчетов ");
        int num = InCMD.nextInt();

        int res = 1;

        example07_04_01 arg_ = new example07_04_01();
        arg_.resul(num);

        for (int i = num; i > 0; i-=2){
            res *=i;
        }

        System.out.println("цикл =" + res);


    }
}
