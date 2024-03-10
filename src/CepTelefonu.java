import java.util.Scanner;

public class CepTelefonu extends Urun {
    Scanner tara = new Scanner(System.in);
    private int ekranYenilemeHizi;
    private int bellekKapasitesi;
    private int kameraCozunurluk;

    public Object urunGir(Object urun) {
        setTur("CepTelefonu");
        System.out.print("Marka giriniz: ");
        setMarka(tara.nextLine());
        System.out.print("Ekran yenileme hızını giriniz: ");
        setEkranYenilemeHizi(tara.nextInt());
        System.out.print("Bellek kapasitesini giriniz: ");
        setBellekKapasitesi(tara.nextInt());
        System.out.print("Kamera çözünürlüğünü giriniz: ");
        setKameraCozunurluk(tara.nextInt());
        System.out.print("Fiyat giriniz: ");
        setFiyat(tara.nextInt());
        System.out.print("Adet giriniz: ");
        setAdet(tara.nextInt());
        return this;
    }

    public void urunSorgula() {
        System.out.println("Marka: " + this.getMarka());
        System.out.println("Ekran yenileme hızı: " + this.ekranYenilemeHizi);
        System.out.println("Bellek kapasitesi: " + this.bellekKapasitesi);
        System.out.println("Kamera çözünürlüğü: " + this.kameraCozunurluk);
        System.out.println("Fiyat: " + this.getFiyat());
        System.out.println("Adet: " + this.getAdet());
    }


    public int getEkranYenilemeHizi() {
        return ekranYenilemeHizi;
    }

    public void setEkranYenilemeHizi(int ekranYenilemeHizi) {
        this.ekranYenilemeHizi = ekranYenilemeHizi;
    }

    public int getBellekKapasitesi() {
        return bellekKapasitesi;
    }

    public void setBellekKapasitesi(int bellekKapasitesi) {
        this.bellekKapasitesi = bellekKapasitesi;
    }

    public int getKameraCozunurluk() {
        return kameraCozunurluk;
    }

    public void setKameraCozunurluk(int kameraCozunurluk) {
        this.kameraCozunurluk = kameraCozunurluk;
    }
}
