/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author RecepOrkun
 */
public class Ortodonti extends Doktor {

    private String unvan;

    public Ortodonti(int id, String isimSoyisim, String telefonNo, String cinsiyet) {
        super(id, isimSoyisim, telefonNo, cinsiyet);
        unvan = "Ortodontist";
    }

    @Override
    public String toString() {
        return super.toString() + " Unvan: " + unvan;
    }

    @Override
    public void ekle(Doktor doktor) {
        getDoktorListesi().add(doktor);
    }

    @Override
    public void listele() {
        
    }

    @Override
    public void sil(Doktor doktor) {
        getDoktorListesi().remove(doktor);
    }

   
}
