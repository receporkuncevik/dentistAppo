package model;

public abstract class Doktor {

    private int id;
    private String isimSoyisim;
    private String telefonNo;
    private String cinsiyet;
    

    public Doktor(int id, String isimSoyisim, String telefonNo, String cinsiyet) {
        this.id = id;
        this.isimSoyisim = isimSoyisim;
        this.telefonNo = telefonNo;
        this.cinsiyet = cinsiyet;
    }

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


    @Override
    public String toString() {
        return  id + " "+ isimSoyisim + " "+ telefonNo + " "+ cinsiyet;
    }

}
