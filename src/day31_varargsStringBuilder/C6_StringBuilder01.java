package day31_varargsStringBuilder;

public class C6_StringBuilder01 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder(); // Bos bir SB olusturur
        System.out.println("sb1: " + sb1);

        StringBuilder sb2 = new StringBuilder("Mehmet"); // Icinde Mehmet olan bir SB olusturur
        System.out.println("sb2: " + sb2);

        StringBuilder sb3 = new StringBuilder(10); // Kapasitesi 10 char olan bir SB olusturur
        System.out.println("sb3: " + sb3);

        sb1.append(" Hoca");
        System.out.println("sb1 append: " + sb1);

        sb2.append(" Hoca");
        System.out.println("sb2 append: " + sb2);

        sb3.append(" Hoca");
        System.out.println("sb3 append: " + sb3);

        System.out.println("sb1 uzunluk: " + sb1.length()); // 5
        System.out.println("sb1 kapasite: " + sb1.capacity()); // 16 (default capacity)

        System.out.println("sb2 uzunluk: " + sb2.length()); // 11
        System.out.println("sb2 kapasite: " + sb2.capacity()); // 22 (16(default) + 6(mehmet) = 22)

        System.out.println("sb3 uzunluk: " + sb3.length()); // 5
        System.out.println("sb3 kapasite: " + sb3.capacity()); // 10 (bizim istedigimiz capacity)

        /* !!! NOT !!!
        Capacity hafiza yonetimi icin cok onemlidir.
         */

    }

}
