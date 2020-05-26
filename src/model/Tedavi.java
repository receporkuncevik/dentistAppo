package model;

import java.util.ArrayList;

public class Tedavi {

    private int tedavi_id;
    private String tedavi_adi;

    public Tedavi(int tedavi_id, String tedavi_adi) {
        this.tedavi_id = tedavi_id;
        this.tedavi_adi = tedavi_adi;
    }
    
    

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
    

    @Override
    public String toString() {
        return + getTedavi_id() + "\t" + getTedavi_adi();
    }

}
