public class example07_05_SuperClass {
    private String Str1;

    example07_05_SuperClass (String Str1){
        System.out.println(Str1);
    }

    public example07_05_SuperClass() {

    }

    public String toString (){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" ;
        return superClassNameAndFieldValue ;
    }
}
