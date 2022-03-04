
public class Main {
    public static void main(String[] args) {
        //Imuhendis imuhendis1 = new Imuhendis();
        Imuhendis pcMuhendisi1 = new PcMuhendisi(false, false);
        
        /*pcMuhendisi1.askerlik_durumu_sorgula();
        pcMuhendisi1.adli_sicil_sorgula();
        System.out.println(pcMuhendisi1.mezuniyet_ortalamasi(4.40));
        String[] tecrube = {"Turksat","Telsim","Innovia Digital"};
        pcMuhendisi1.is_tecrubesi(tecrube);*/
        
        MakineMuhendisi makineMuhendisi1 = new MakineMuhendisi(true, false);
        
        String[] tecrube = {"Turksat","Telsim","Innovia Digital"};
        String[] referans = {"Innovia Digital","BSU University"};
        
        makineMuhendisi1.askerlik_durumu_sorgula();
        makineMuhendisi1.adli_sicil_sorgula();
        System.out.println(makineMuhendisi1.mezuniyet_ortalamasi(4.9));
        makineMuhendisi1.is_tecrubesi(tecrube);
        makineMuhendisi1.referens_getir(referans);
        makineMuhendisi1.calis();
        //((MakineMuhendisi)makineMuhendisi1).referens_getir(referans);
    }
}
