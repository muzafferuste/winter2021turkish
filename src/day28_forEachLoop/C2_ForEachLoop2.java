package day28_forEachLoop;

public class C2_ForEachLoop2 {

    public static void main(String[] args) {

    /* Bir Integer Array olusturunuz
    bu Array'deki tum sayilarin carpimini forEachLoop kullanarak bulunuz
    Sonucu ekrana yazdiriniz
     */

        int arr[] = {1, 2, 1, 2, 4, 3, 1, 2};
        int carpim = 1;

        for (int each:
             arr) {

        carpim*=each;
        }

        System.out.println("Array'deki tum elemanlarin carpimi: " + carpim);

    }

}
