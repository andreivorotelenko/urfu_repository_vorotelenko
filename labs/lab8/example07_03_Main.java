import java.util.Scanner;

public class example07_03_Main {
    public static void main(String[] args) {
        Scanner inCMD = new Scanner(System.in);
        System.out.print("Введите количество элементов ");
        int num = inCMD.nextInt();
        example07_03_Rec Obj = new example07_03_Rec();
        Obj.setNum(num);
        System.out.println("Вывод массива");
        Obj.getNum();
    }
}
