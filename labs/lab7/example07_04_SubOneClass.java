public class example07_04_SubOneClass extends example07_04_SuperClass {
    public char Ch1;
    example07_04_SubOneClass (String ob){
        super(ob);
    }

    example07_04_SubOneClass (String str0, char Ch1){
        super(str0, Ch1);
    }
    @Override
    public String toString () {

        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n";
        return ClassNameAndFieldValue ;

    }
}
