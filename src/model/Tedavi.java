package model;

import java.util.ArrayList;

public abstract class Tedavi {

    private int tedavi_id;
    private String tedavi_adi;
    private static ArrayList<Tedavi> tedaviListesi = new ArrayList<>();

    public Tedavi(int tedavi_id, String tedavi_adi) {
        this.tedavi_id = tedavi_id;
        this.tedavi_adi = tedavi_adi;
    }
    
    public abstract void ekle(Tedavi tedavi);
    public abstract void listele();
    public abstract void sil(Tedavi tedavi);
   
    

    public int getTedavi_id() {
        return tedavi_id;
    }

    public void setTedavi_id(int tedavi_id) {
        this.tedavi_id = tedavi_id;
    }

    public String getTedavi_adi() {
        return tedavi_adi;
    }

    public void setTedavi_adi(String tedavi_adi) {
        this.tedavi_adi = tedavi_adi;
    }

    public static ArrayList<Tedavi> getTedaviListesi() {
        return tedaviListesi;
    }

    public static void setTedaviListesi(ArrayList<Tedavi> tedaviListesi) {
        Tedavi.tedaviListesi = tedaviListesi;
    }
    

    @Override
    public String toString() {
        return "ID : " + tedavi_id + " Tedavi Adı: " + tedavi_adi;
    }

}
