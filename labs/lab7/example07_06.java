import java.util.Scanner;

public class example07_06 {
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

        Scanner InCMD_ = new Scanner(System.in);
        System.out.print("\nВыберете количество элементов = ");
        int num_ = InCMD_.nextInt();

        System.out.print("Оставшийся массив = ");
        example07_06_01 arg_ = new example07_06_01();
        int [] print_arr = arg_.Limit(x, num_);
        System.out.print("\nВернувшийся массив = ");
        for (int i = 0; i < print_arr.length; i++){
            System.out.print(print_arr[i] + " ");
        }
    }
}
