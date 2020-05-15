package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Dolgu extends Tedavi{

    private String tedaviAciklama;

    public Dolgu(int tedavi_id, String tedavi_adi,String tedaviAciklama) {
        super(tedavi_id, tedavi_adi);
        this.tedaviAciklama = tedaviAciklama;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nTedavi Açıklaması:" + tedaviAciklama;
    }

    @Override
    public void ekle(Tedavi tedavi) {
        getTedaviListesi().add(tedavi);
    }

    @Override
    public void listele() {
        
    }

    @Override
    public void sil(Tedavi tedavi) {
      getTedaviListesi().remove(tedavi);
    }
    
    

}
