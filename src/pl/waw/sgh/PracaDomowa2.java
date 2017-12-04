package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PracaDomowa2 {

    static final String PLIK = "GOOG.csv";
    public static void main(String[] args) {
        File file = new File(PLIK);
        String cwd = System.getProperty("user.dir");
        System.out.println(cwd);

        if (file.exists()) {
            System.out.println("Plik istnieje");
        } else {
            System.out.println("Plik nie istnieje");
        }


        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String row = scanner.nextLine();
                System.out.println(row);
                String[] columns = row.split(",");
                for (String element : columns) {
                    System.out.println("Open: " + columns[1] + " Close: " + columns[4]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Problem z wczytaniem pliku...");
        }
    }
}
