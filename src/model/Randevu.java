
package model;

import java.util.ArrayList;
import java.util.Date;

public class Randevu {

    private int id;
    private Hasta hasta;
    private Tedavi tedavi;
    private Date randevuTarihi;
    public static ArrayList<Randevu> randevuListesi = new ArrayList<>();

    public Randevu(int id, Hasta hasta, Tedavi tedavi, Date randevuTarihi) {
        this.id = id;
        this.hasta = hasta;
        this.tedavi = tedavi;
        this.randevuTarihi = randevuTarihi;
    }

    public static void randevuEkle(Randevu randevu){
        randevuListesi.add(randevu);
    }
    
    public static void randevuListele(){
        for(Randevu r:randevuListesi){
            System.out.println(r);
        }
    }
    
    public static void hastaSil(Randevu randevu){
        randevuListesi.remove(randevu);
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getRandevuTarihi() {
        return randevuTarihi;
    }

    public void setRandevuTarihi(Date randevuTarihi) {
        this.randevuTarihi = randevuTarihi;
    }

    @Override
    public String toString() {
        return  "ID: " + id + " Hasta: " + hasta.getHasta_adSoyad() + " Tedavi: " + tedavi.getTedavi_adi() + " RandevuTarihi: " + randevuTarihi;
    }

    

}
