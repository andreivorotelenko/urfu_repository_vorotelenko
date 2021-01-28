public class example07_03_SubTwoClass extends example07_03_superClass{

    public String str2;
    public int int2;

    example07_03_SubTwoClass(String intEx) {
        super(intEx);
    }
    @Override
    public String toString () {

        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n";
        return ClassNameAndFieldValue ;

    }

}
