package day28_forEachLoop;

public class C1_ForEachLoop1 {

    public static void main(String[] args) {

        // each ==> her bir demektir

        // bir Array'in tum elemanlarini forLoop ile yazdiralim

        int arr[] = {2, 4, 6, 8, 10};

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        /* forLoop yazmamimizin amaci Array'in TUM ELEMANLARI uzerinde islem yapmak ise
        forEachLoop daha kolay kod yazmamizi saglar.
        * ForEachLoop istedigim bir topluluktaki tum elemanlari birer birer bana getirir
        * ForEachLoop'da baslangic degeri, bitis degeri ve index YOKTUR.
         */

        System.out.println(); // gorevi ==> console'u alt satira indirmek

        for (int each:
                arr) {

            System.out.print(each + " ");
        }

    }

}
