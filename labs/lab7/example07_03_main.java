public class example07_03_main {
    public static void main(String[] args) {
        example07_03_superClass superClassObject = new example07_03_superClass("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        example07_03_SubOneClass superClassSubObject = new example07_03_SubOneClass("передал в конструктор суперкласса");
        String classSubName = superClassObject.toString();
        System.out.println(classSubName);
    }
}
