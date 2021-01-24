import java.util.Scanner;

public class example07_08 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        System.out.print("Введите количество элементов массива = ");
        int num = InCMD.nextInt();

        //Создание массива рандомных чисел для выборки
        int [] x = new int [num];
        System.out.print("Созданный массив = ");
        //рандомная генерация массива
        for (int i=0;i<num ;i++ ) {
            int a = (int) (Math.random()*(999_999+1)) - 100_000;
            x[i] = a;
            System.out.print(a + " ");
        }
        example07_08_01 arg_ = new example07_08_01();
        double print_ = arg_.SR_ZNC(x);
        System.out.print("\nСреднее значение массива = " + print_);
    }
}
