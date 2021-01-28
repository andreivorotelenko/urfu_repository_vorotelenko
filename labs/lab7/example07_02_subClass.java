public class example07_02_subClass extends example07_02_superClass {

    //закрытое текстовое поле
    private String str1;

    //конструктор с текстовым аргументом
    example07_02_subClass(String strEx){
        super(strEx);
    }

    example07_02_subClass (int INT){
        super(INT);
    }

    example07_02_subClass (int INT, String strEx){
        super(INT);
    }


    @Override
    public String toString () {


        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "_";
        return ClassNameAndFieldValue;
    }


}
