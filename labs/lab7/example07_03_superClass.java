public class example07_03_superClass {

    public String str_1;

    public int int_1;

    example07_03_superClass(String intEx){
        this.str_1 = intEx;
    }


    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" ;
        return superClassNameAndFieldValue ;
    }

    public void setStr1(String str1) {
        this.int_1 = int_1;
    }


}
