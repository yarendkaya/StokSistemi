import java.util.ArrayList;
import java.util.Scanner;

public class DemoUrun {

    private static ArrayList<Urun> urunListesi= new ArrayList<>();


    private static int girilenUrunSayisi;
    static Scanner tara = new Scanner(System.in);
     static int girilenUrunSayaci=0;

    public int getGirilenUrunSayisi() {
        return girilenUrunSayisi;
    }


    public void setGirilenUrunSayisi(int girilenUrunSayisi) {
        this.girilenUrunSayisi = girilenUrunSayisi;
    }

    public static void main(String[] args) {
        int islem = 0;
        int cihazTuru;



        baslikYazdir();
        System.out.println("Stoka girilecek ürün sayısı: ");
        girilenUrunSayisi = tara.nextInt();


        while (islem != 4) {
            menuYazdir();
            islem = islemSec();
            switch (islem) {
                case 1:
                    if(girilenUrunSayaci==girilenUrunSayisi){
                        System.out.println("Maksimum ürün sayısı:"+girilenUrunSayisi);
                        System.out.println("Girilen ürün sayısı: "+girilenUrunSayaci);
                        System.out.println("Yeni ürün girilemez!");
                        continue;
                    }

                    System.out.println("Ürün Giriş:");
                    cihazTuru = menuUrunSec();
                    switch (cihazTuru) {
                        case 1:
                            CepTelefonu phone1 = new CepTelefonu();
                            phone1.urunGir(phone1);
                            urunListesi.add(phone1);
                            girilenUrunSayaci++;
                            break;
                        case 2:
                            FotografMakinesi fotografMakinesi = new FotografMakinesi();
                            fotografMakinesi.urunGir(fotografMakinesi);
                            urunListesi.add(fotografMakinesi);
                            girilenUrunSayaci++;
                            break;
                        default:
                            System.out.println("Lütfen geçerli bir işlem giriniz.");
                    }

                    break;
                case 2:
                    System.out.println("Ürün Sorgulama");
                    int sayac = 0;
                    if (urunListesi.isEmpty()){
                        System.out.println("Önce ürün ekleyiniz.");
                        continue;
                    }
                    switch (menuUrunSec()) {
                        case 1:
                            for (Urun eleman : urunListesi) {
                                if (eleman.getTur().equals("CepTelefonu")) {
                                    eleman.urunSorgula();
                                } else {
                                    sayac++;
                                }
                            }
                            if (sayac == girilenUrunSayisi) {
                                System.out.println("Ürün listesinde cep telefonu bulunamadı!");
                            }
                            break;

                        case 2:
                            for (Urun eleman : urunListesi) {
                                if (eleman.getTur().equals("FotografMakinesi")) {
                                    eleman.urunSorgula();
                                } else {
                                    sayac++;
                                }
                            }
                            if (sayac == girilenUrunSayisi) {
                                System.out.println("Ürün listesinde fotoğraf makinesi bulunamadı!");
                            }
                            break;

                        default:
                            System.out.println("Ürün seçimi için 1 ya da 2 değerini giriniz.");
                    }
                    break;

                case 3:
                    urunListesiSifirla();
                    System.out.print("Stoka girilecek ürün sayısı: ");
                    girilenUrunSayisi=tara.nextInt();

                default:
                    System.out.println("Bizi tercih ettiğiniz teşekkürler");
            }


        }


    }

    private static int islemSec() {
        System.out.println("İşlem seçiniz: ");
        return tara.nextInt();
    }


    public static void baslikYazdir() {
        System.out.println("****************************************");
        System.out.println("***STOK ÜRÜN GİRİŞ VE SORGULAMA PROGRAMI");
        System.out.println("****************************************");
    }

    public static void menuYazdir() {
        System.out.println("MENÜ: ");
        System.out.println("1)Ürün gir \n2)Ürün sorgula \n3)Ürün listesi sıfırla \n4) Programı sonlandır");
    }

    public static int menuUrunSec() {
        System.out.println("1)Cep Telefonu \n2) Fotoğraf Makinesi");
        System.out.println("\n\nÜrün Seçiniz: ");
        return tara.nextInt();
    }

    public static void urunListesiSifirla() {
        urunListesi = null;
        girilenUrunSayisi = 0;
        girilenUrunSayaci=0;

        System.out.println("Ürün listesi sıfırlandı.");

    }


}
