
public class PcMuhendisi implements Imuhendis{
    private boolean  askerlik;
    private boolean adli_sicil;
    
    public PcMuhendisi(boolean askerlik , boolean adli_sicil){
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    
    @Override
    public void askerlik_durumu_sorgula() {
        if(askerlik){
            System.out.println("Askerligimi Yaptim..");
        }
        else{
            System.out.println("Askerligimi henuz yapmadim.");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(Double derece) {
        return "Ortalamam" + derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if(adli_sicil){
            System.out.println("Adli sicil kaydim bulunuyor");
        }
        else{
            System.out.println("Herhangi bir adli sicil kaydim bulunmiyor");
        }
    }

    @Override
    public void is_tecrubesi(String[] array) {
        System.out.println("Bilgisayar Muhendisi olarak Su sirketlerle calistim:");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    
}
