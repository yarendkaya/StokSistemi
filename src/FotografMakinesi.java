import java.util.Scanner;

public class FotografMakinesi extends Urun {
    Scanner tara= new Scanner(System.in);

    private int dijitalZoom;
    private int optikZoom;

    public Object urunGir(Object urun){
        setTur("FotografMakinesi");
        System.out.print("Marka giriniz: ");
        setMarka(tara.nextLine());
        System.out.print("Dijital zoom değerini giriniz: ");
        setDijitalZoom(tara.nextInt());
        System.out.print("Optik zoom değerini giriniz:");
        setOptikZoom(tara.nextInt());
        System.out.print("Fiyat giriniz: ");
        setFiyat(tara.nextInt());
        System.out.print("Adet giriniz: ");
        setAdet(tara.nextInt());
        return null;
    }
    public void urunSorgula(){
        System.out.println("Marka: "+ this.getMarka());
        System.out.println("Dijital zoom: "+this.dijitalZoom);
        System.out.println("Optik zoom: "+ this.optikZoom);
        System.out.println("Fiyat: "+ this.getFiyat());
        System.out.println("Adet: "+ this.getAdet());
    }

    public int getDijitalZoom() {
        return dijitalZoom;
    }

    public void setDijitalZoom(int dijitalZoom) {
        this.dijitalZoom = dijitalZoom;
    }

    public int getOptikZoom() {
        return optikZoom;
    }

    public void setOptikZoom(int optikZoom) {
        this.optikZoom = optikZoom;
    }
}
