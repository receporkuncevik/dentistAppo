package model;

import java.util.ArrayList;

public abstract class Doktor {

    private int id;
    private String isimSoyisim;
    private String telefonNo;
    private String cinsiyet;
    private static ArrayList<Doktor> doktorListesi = new ArrayList<>();

    public Doktor(int id, String isimSoyisim, String telefonNo, String cinsiyet) {
        this.id = id;
        this.isimSoyisim = isimSoyisim;
        this.telefonNo = telefonNo;
        this.cinsiyet = cinsiyet;
    }

    public abstract void ekle(Doktor doktor);

    public abstract void listele();

    public abstract void sil(Doktor doktor);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsimSoyisim() {
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {
        this.isimSoyisim = isimSoyisim;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public static ArrayList<Doktor> getDoktorListesi() {
        return doktorListesi;
    }

    public static void setDoktorListesi(ArrayList<Doktor> doktorListesi) {
        Doktor.doktorListesi = doktorListesi;
    }

    @Override
    public String toString() {
        return "ID= " + id + " İsim Soyisim:" + isimSoyisim + " Telefon No:" + telefonNo + " Cinsiyet: " + cinsiyet;
    }

}
