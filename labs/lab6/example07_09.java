import java.util.Scanner;

public class example07_09 {
    public static void main(String[] args) {
        System.out.print("Введите строку = ");
        Scanner InCMD = new Scanner(System.in);
        String str = InCMD.nextLine();
        char [] str_char = str.toCharArray();

        System.out.print("Вызодной массив = ");
        example07_09_01 arg_ = new example07_09_01();
        char [] print_arr = arg_.MST(str_char);

        for (int i = 0; i < print_arr.length; i++) {
            System.out.print(print_arr[i] + " ");
        }
    }
}
