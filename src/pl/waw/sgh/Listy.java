package pl.waw.sgh;

import java.util.*;

public class Listy {
    /*
    Interfejsy mają wyłacznie deklaracje metod
    Pozwala ominąć ograniczenie pojedynczego dziedziczenia

    Różnica między set a list: 1. w SET elementy nie są uporządkowane; w LIST tak.
                               2. W zbiorze obiekt może występować co najwyżej 1 raz
    */

    public static void main(String[] args) {
        List<Integer> listaInt = new ArrayList<>();

        listaInt.add(3);
        listaInt.add(35);
        listaInt.add(13512);

        for (int i=0; i<listaInt.size(); i++) {
            System.out.println("Element: " + i + " = " + listaInt.get(i));
        }

        Set<String> strSet = new HashSet<>();
        strSet.add("abc");
        strSet.add("q43f");
        strSet.add("asd");
        strSet.add("abc"); // Nie doda się

        // elementy nie są uporządkowane, więc nie ma .get()
        for (String str : strSet) {
            System.out.println(str);
        }

        System.out.println(strSet.contains("abc")); // TRUE

        Map<String, String> mapa = new HashMap<>();
        mapa.put("abc", "test");
        mapa.put("def", "tesqsa");
        mapa.put("abc", "test2"); // Nadpisze

        // Klucze są unikalne

        System.out.println(mapa.keySet());
        System.out.println(mapa.get("abc"));

        for (String key : mapa.keySet()) {
            System.out.println(key + " = " + mapa.get(key));
        }
    }
}
