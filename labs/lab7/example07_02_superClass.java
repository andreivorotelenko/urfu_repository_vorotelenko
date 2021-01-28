public class example07_02_superClass {
    //закрытое текстовое поле
    private String str1;
    private int str1_len;
    private int str_1;
    private int INT;

    //конструктор с текстовым аргументом
    example07_02_superClass(String strEx){
        this.str1 = strEx;
    }

    example07_02_superClass(int INT) {
    }

    @Override
    public String toString () {
        this.str1_len =(int) this.str1.length();

        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1() + "\n";
        return ClassNameAndFieldValue ;

    }

    //геттер - метод который только возвращает значения
    public int getStr1() {
        return str1_len;
    }


}
