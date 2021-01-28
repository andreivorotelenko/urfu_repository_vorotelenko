public class example07_05_SubOneClass extends example07_05_SuperClass{
    private int Int1;

    example07_05_SubOneClass(String Str1) {
        super(Str1);
    }
    example07_05_SubOneClass (int Int1){
        super();
        this.Int1 = Int1;
    }
    public String toString (){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" ;
        return superClassNameAndFieldValue ;
    }
}
