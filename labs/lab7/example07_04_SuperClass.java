public class example07_04_SuperClass {
    public String str0;
    example07_04_SuperClass(String strEx){
        this.str0 = strEx;
    }

    public example07_04_SuperClass(String str0, char ch1) {
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" ;
        return superClassNameAndFieldValue ;
    }
}
