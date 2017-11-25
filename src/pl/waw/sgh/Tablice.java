package pl.waw.sgh;

public class Tablice {
    public static void main(String[] args) {
        //int[] tab = new int[5];
        Integer[] tab = new Integer[5]; // zamiast 0 niewiadome elementy wypelniane sa NULLami bo nie wskazuja na zaden obiekt
        tab[0] = 433;
        tab[1] = 43453;

        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]!=null) suma += tab[i];
            System.out.println("Element"+i+"="+tab[i]);
        }
        System.out.println(suma);


    }
}
