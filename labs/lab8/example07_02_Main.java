import java.util.Scanner;

public class example07_02_Main {
    public static void main(String[] args) {
        Scanner inCMD = new Scanner(System.in);
        System.out.print("Введите число ");
        int num = inCMD.nextInt();
        example07_02_Rec REC = new example07_02_Rec();
        REC.setNum(num);
        REC.getNum();


    }

}
