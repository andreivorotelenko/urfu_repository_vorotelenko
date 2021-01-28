public class example07_04_Main {
    public static void main(String[] args) {
        example07_04_SuperClass superClassObject = new example07_04_SuperClass("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);


    }
}
