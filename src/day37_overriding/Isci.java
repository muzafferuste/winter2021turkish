package day37_overriding;

public class Isci extends Personel {

    public String bolum = "Kaynak Atolyesi";
    public  int maas = 5000;
    public String isim = "Mesut";

    public int maasHesapla() {

        System.out.println(30 * 8 * 15);

        return 30 * 8 * 15; // 30 gun * 8 gunluk mesai saati * 15 saat ucreti
        // 3600
    }

    @Override
    public void mesai() {

        System.out.println("Isciler gunluk 8 saat calisir");

    }

    // overloading: ayni isimde ama farkli method signature'larina sahip methodlar

    public int maasHesapla(int gunSayisi) {

        return gunSayisi * 8 * 15;
    }

    public int maasHesapla(int gunlukCalismaSaati, int gunSayisi) {

        return gunSayisi * gunlukCalismaSaati * 15;
    }

    public int maasHesapla(int gunlukCalismaSaati, int gunSayisi, int saatUcreti) {

        return gunSayisi * gunlukCalismaSaati * saatUcreti;
    }

}
