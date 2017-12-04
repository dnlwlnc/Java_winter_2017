package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pliki {
    //static final String PLIK = "plik.txt";
    static final String PLIK = "cdr.csv";

    public static void main(String[] args) /*throws FileNotFoundException*/ {
        File file = new File(PLIK);

        if (file.exists()) {
            System.out.println("Plik istnieje");
        } else {
            System.out.println("Plik nie istnieje");
        }
        // Lokalizacja naszego programu
        String cwd = System.getProperty("user.dir");
        System.out.println(cwd);

        // Czytanie plików txt

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String linia = scanner.nextLine();
                System.out.println(linia);
                String[] elementy = linia.split(",");
                for (String element : elementy) {
                    System.out.println(element);
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Problem z wczytaniem pliku...");
        }

        if (file.isDirectory()) {
            file.list();
        }

    }
}
