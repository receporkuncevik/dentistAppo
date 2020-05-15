package model;

public class DisCekimi extends Tedavi{

    private String tedaviAciklama;

    public DisCekimi(int tedavi_id, String tedavi_adi) {
        super(tedavi_id, tedavi_adi);
        tedaviAciklama = "Diş çekimi, bir diş hekimi veya ağız cerrahı tarafından lokal, genel,\n"
                + "intravenöz anestezi veya bir kombinasyonu ile nispeten hızlı gerçekleştirilen bir ayakta tedavi prosedürü olarak yapılan,\n"
                + "dişin kemikteki soket denilen yuvasından cerrahi müdahale ile çıkarılması işlemine verilen isimdir.";
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

    @Override
    public String toString() {
        return super.toString() + "\nTedavi Açıklaması:" + tedaviAciklama;
    }

    

}
