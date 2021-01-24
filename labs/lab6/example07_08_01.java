public class example07_08_01 {
    public double SR_ZNC (int [] ar){
        double sr_znc = 0;
        for (int i = 0; i < ar.length; i++){
            sr_znc += ar[i];
        }
        sr_znc /= ar.length;
        return sr_znc;
    }
}
