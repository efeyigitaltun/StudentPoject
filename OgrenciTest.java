public class OgrenciTest {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        Ogrenci ogr2 = new Ogrenci("Gökhan", "Bilgisayar");
        Ogrenci ogr3 = new Ogrenci("Ayşe", "Bilgisayar", "1985", 2.5);
        Ogrenci ogr4 = new Ogrenci("Elif", "Elektrik Müh", "2020", 1.98);
        System.out.println("Ogrenciler");
        System.out.println("OGR-1 " + ogr1.getAd() + " " + ogr1.getBolum() + " " + ogr1.ogrNoHesapla() + " " + ogr1.getGano());
        System.out.println("OGR-2 " + ogr2.getAd() + " " + ogr2.getBolum() + " " + ogr2.getGano());
        System.out.println("OGR-3 " + ogr3.getAd() + " " + ogr3.getBolum() + " " + ogr3.ogrNoHesapla() + " " + ogr3.getGano());
        System.out.println("OGR-4 " + ogr4.getAd() + " " + ogr4.getBolum() + " " + ogr4.ogrNoHesapla() + " " + ogr4.getGano());

        System.out.println("OGR-1 Harc " + ogr1.harcHesap(4));
        System.out.println("OGR-2 Harc " + ogr2.harcHesap2(4, 2));
    }

}

