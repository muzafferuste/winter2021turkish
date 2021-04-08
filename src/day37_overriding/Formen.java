package day37_overriding;

public class Formen extends Isci{

    public String sorumluOlduguBolum = "Bakim";
    public String isim = "Emrullah";

    public static void main(String[] args) {

        // Inheritance'da data turu olarak class ismi kullanimi

        /* Bir class'da obje uretirken data turu olarak class'in kendisini
        veya parent(lar)'ini kullanabiliriz
        * Olusturdugumuz obje ile variable kullanamamiz gerekirse, hangi degeri
        alacagini anlamak icin once Data Turu olan class'a gideriz
        orada aradigimiz variable varsa kullaniriz, yoksa parent(lar)'ina bakariz,
        yukari dogru giderken ilk buldugumuz deger kullaniriz
         */

        Formen fr1 = new Formen();
        // fr1 objesini kullanarak hangi class'in variable'larini gorebilirim:
        // Formen, Isci, Personel
        fr1.sorumluOlduguBolum = "Marangozhane";
        fr1.maas = 10000;
        System.out.println(fr1.isim + " " + fr1.sorumluOlduguBolum
                + " " + fr1.maas); // Emrullah Marangozhane 10000

        Isci fr2 = new Formen();
        // Data turu olarak Isci secildigi icin Isci class'indaki variable'lara ve method'lara
        // ve de Isci'nin parent class'larindaki variable'lara ve method'lara ulasiriz
        fr2.bolum= "KaynakAtolyesi";
        // fr2.isim = "Yakup";
        System.out.println(fr2.isim + " " + fr2.bolum
                + " " + fr2.maas); // Mesut KaynakAtolyesi 5000

        Personel fr3 = new Formen();
        System.out.println(fr3.isim); // Emre (Personel class'indaki isim variable'in degeri)

    }

}
