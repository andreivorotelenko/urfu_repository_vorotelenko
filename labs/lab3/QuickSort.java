import java.util.Arrays;
import java.util.Scanner;
 
public class QuickSort {
 
    public static void quickSort(int[] array, int low, int high) {
        
        //завершить выполнение если длина массива равна 0 и завершить выполнение если уже нечего делить
        if (array.length == 0 & low >= high)
            return;
 
 
        // выбрать опорный элемент
        // опорный - середина
        int middle = low + (high - low) / 2;
        int opora = array[middle];
 
        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] > opora) {
                i++;
            }
 
            while (array[j] < opora) {
                j--;
            }
 
            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);
 
        if (high > i)
            quickSort(array, i, high);
    }
    public static void main(String[] args) {

        Scanner InCMD = new Scanner (System.in);
        System.out.print("Size array: ");
        int num = InCMD.nextInt();

        int [] x = new int [num];

        for (int i=0;i<num ;i++ ) {
            int a = (int) (Math.random()*(200_000_000+1)) - 100_000_000;
            x[i] = a;
        }

        long startTime = System.currentTimeMillis();

        
        System.out.println("Было");
        System.out.println(Arrays.toString(x));
 
        int low = 0;
        int high = x.length - 1;
 
        quickSort(x, low, high);

        System.out.println("Стало");
        System.out.println(Arrays.toString(x));

        long endTime = System.currentTimeMillis();

       System.out.println("Total execution time: " + (endTime-startTime) + "ms" );
    }
}