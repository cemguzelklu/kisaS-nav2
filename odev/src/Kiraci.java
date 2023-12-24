public class Kiraci {
    String isim;
    String soyİsim;
    evSahibi evSahibi;

    // UMLde yazdigi gibi kiracı isim, soyisim ve ev sahibi parametreleri alır
    Kiraci(String isim, String soyİsim, evSahibi evSahibi) {
        this.isim = isim;
        this.soyİsim = soyİsim;
        this.evSahibi = evSahibi;
    }


    void displayInfo() {//displayinfoyla bu classda tanımladığımız verileri ekrana yazdırıyoruz
        System.out.println("Kiracının ismi: " + isim + "\nKiracının soyismi: " + soyİsim + "\nEv sahibinin bilgileri: ");
        evSahibi.displayInfo();//evsahibi sınıfının displayinfosunu çalıştırdık çünkü 1 kiracının 1 evsahibi vardır 1-1

    }
}