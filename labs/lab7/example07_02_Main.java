public class example07_02_Main {
    public static void main(String[] args) {


        //передача в конструктор суперкласса строки
        example07_02_superClass superClassObject = new example07_02_superClass("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

    example07_02_subClass subClassObject1 = new example07_02_subClass("передал в конструктор подкласса");
    String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

    }
}