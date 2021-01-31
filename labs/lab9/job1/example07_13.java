//Пример работы с аргументами метода main. На
//рисунке 5 представлена настройка проекта и задание входных
//значений аргументов.

package job1;

public class example07_13 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива= " + l);

            //генерация более естественным образом ошибки
            int h=10/l;
            args[l + 1] = "10";

            //обработка ошибки
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");

            // не выполняемый блок
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс не существует");
        }
    }
}
