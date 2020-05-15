package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Hasta {

    private int hasta_id;
    private String hasta_adSoyad;
    private String hasta_telefonNo;
    private String hasta_email;
    public ArrayList<Hasta> hastaListesi = new ArrayList<>();

    public Hasta(int hasta_id, String hasta_adSoyad, String hasta_telefonNo, String hasta_email) {
        this.hasta_id = hasta_id;
        this.hasta_adSoyad = hasta_adSoyad;
        this.hasta_telefonNo = hasta_telefonNo;
        this.hasta_email = hasta_email;

    }

    public void hastaEkle(Hasta hasta) {
        hastaListesi.add(hasta);
    }

    public void hastalistele() {
        
    }

    public void hastaAra(Hasta hasta) {
        if (hastaListesi.contains(hasta)) {
            System.out.println("Hasta Var");
        } else {
            System.out.println("Hasta Yok");
        }
    }

    public void hastaSil(Hasta hasta) {
        hastaListesi.remove(hasta);
    }

    public void hastaSil(Hasta hasta, int id) {
        if (hasta.getHasta_id() == id) {
            hastaListesi.remove(hasta);
            System.out.println("Hasta Silindi Overload");
        } else {
            System.out.println("Hasta Silinemedi.");
        }

    }

    public int getHasta_id() {
        return hasta_id;
    }

    public void setHasta_id(int hasta_id) {
        this.hasta_id = hasta_id;
    }

    public String getHasta_adSoyad() {
        return hasta_adSoyad;
    }

    public void setHasta_adSoyad(String hasta_adSoyad) {
        this.hasta_adSoyad = hasta_adSoyad;
    }

    public String getHasta_telefonNo() {
        return hasta_telefonNo;
    }

    public void setHasta_telefonNo(String hasta_telefonNo) {
        this.hasta_telefonNo = hasta_telefonNo;
    }

    public String getHasta_email() {
        return hasta_email;
    }

    public void setHasta_email(String hasta_email) {
        this.hasta_email = hasta_email;
    }

    @Override
    public String toString() {
        return "ID: " + hasta_id + " Adı Soyadı=" + hasta_adSoyad + ", Telefon Numarası=" + hasta_telefonNo + ", Email=" + hasta_email;
    }

    

}
