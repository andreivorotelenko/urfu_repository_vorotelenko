public class example07_05_Main {
    public static void main(String[] args) {
        example07_05_SuperClass superClassObject = new example07_05_SuperClass("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        example07_05_SubOneClass subClassObject = new example07_05_SubOneClass("передал в конструктор подкласса");
        String ClassName = subClassObject.toString();
        System.out.println(ClassName);
    }
}
