public class example07_03_SubOneClass extends example07_03_superClass{
    public String str2;

    //конструктор с одним параметром
    example07_03_SubOneClass(String strEx) {
        super(strEx);
    }
    //конструктор с двумя параметрами
    example07_03_SubOneClass(String strEx2, String strEx3){
        super( strEx2);
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 2 = " + this.str2 + "\n";
        return ClassNameAndFieldValue ;
    }

    public String getStr2() {
        return str2;
    }
    public void setStr2(String str2) {
        this.str2 = str2;
    }
}
