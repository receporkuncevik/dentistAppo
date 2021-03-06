package model;

public class Dolgu extends Tedavi {

    private String tedaviAciklama;

    public Dolgu(int tedavi_id, String tedavi_adi, String tedaviAciklama) {
        super(tedavi_id, tedavi_adi);
        this.tedaviAciklama = tedaviAciklama;
    }

    @Override
    public String getTedaviAciklama() {
        return tedaviAciklama;
    }

    public void setTedaviAciklama(String tedaviAciklama) {
        this.tedaviAciklama = tedaviAciklama;
    }

    @Override
    public String toString() {
        return +getTedavi_id() + "\t" + getTedavi_adi() + "\t" + getTedaviAciklama();
    }


}
