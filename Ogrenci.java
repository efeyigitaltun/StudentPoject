public class Ogrenci {
    private String ad;
    private String bolum;
    private String girisYili;
    private String OgrenciNo;
    private double gano;
    private static final int bolumKodu = 141;
    private static int siraNo = 0;

    public Ogrenci() {
        this(null, null, "1988", 2.5);
    }

    public Ogrenci(String ad, String bolum) {
        this(ad, bolum, "1919", 3.2);
    }

    public Ogrenci(String ad, String bolum, String girisYili, double gano) {
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Gano değeri hatalıdır!");
        }
        this.ad = ad;
        this.bolum = bolum;
        this.gano = gano;
        this.girisYili = girisYili;
    }

    public Ogrenci(Ogrenci ogrenci) {
        this(ogrenci.ad, ogrenci.bolum, ogrenci.girisYili, ogrenci.gano);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(String girisYili) {
        this.girisYili = girisYili;
    }

    public String getOgrenciNo() {
        return OgrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        OgrenciNo = ogrenciNo;
    }

    public double getGano() {
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Gano hatalı!");

        }
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public String ogrNoHesapla() {
        siraNo++;
        if (siraNo < 10) {
            OgrenciNo = "" + girisYili + bolumKodu + "00" + siraNo;
        } else if (siraNo < 100) {
            OgrenciNo = "" + girisYili + bolumKodu + "0" + siraNo;
        } else
            OgrenciNo = OgrenciNo = "" + girisYili + bolumKodu + siraNo;
        return OgrenciNo;
    }

    public double harcHesap(int derssayisi) {
        double harc = derssayisi * 120;
        return harc;
    }

    public double harcHesap2(int derssayisi, int uzatmalar) {
        double harc = derssayisi * 120 * uzatmalar;
        return harc;
    }


}
