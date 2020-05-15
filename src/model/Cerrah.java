package model;

import java.util.ArrayList;

public class Cerrah extends Doktor  {

    private String unvan;

    public Cerrah(int id, String isimSoyisim, String telefonNo, String cinsiyet) {
        super(id, isimSoyisim, telefonNo, cinsiyet);
        this.unvan = "Cerrah";
    }

    @Override
    public void ekle(Doktor doktor) {
        getDoktorListesi().add(doktor);
        DosyaIslemleri.dosyayaYaz(getDoktorListesi(), "src/dosyalar/doktor.txt");
    }

    @Override
    public void listele() {
        ArrayList geciciListe = DosyaIslemleri.dosyadanOku("src/dosyalar/doktor.txt");
        for(Object o : geciciListe){
            System.out.println(o);
        }
        
    }

    @Override
    public void sil(Doktor doktor) {
        getDoktorListesi().remove(doktor);
    }

    @Override
    public String toString() {
        return super.toString() + " Unvan: " + unvan;
    }

   

}
