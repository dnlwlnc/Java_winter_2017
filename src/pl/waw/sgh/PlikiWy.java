package pl.waw.sgh;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PlikiWy {
    static final String PLIK = "./CSV";
    public static void main(String[] args) throws IOException {

        File file = new File(PLIK);
        if (file.isDirectory()) {
            File[] pliki = file.listFiles();
            for (File plik : pliki) {
                System.out.println(plik + " " + plik.isDirectory());
            }
        }

        File plikWej = new File("plik.txt");
        System.out.println(plikWej.getAbsoluteFile());
        String inputName = plikWej.getName().toString();
        String fileExtension = inputName.substring(inputName.lastIndexOf(".")+1, inputName.length());

        System.out.println(fileExtension);

        //System.out.println(plikWej.getName().toString().substring(0, plikWej.getName().lastIndexOf(".")));

        /*
        File plikWy = new File("plikWy.txt");
        FileWriter fw = new FileWriter(plikWy);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Pierwsza linia");
        bw.write("Druga linia bez znaku konca linii");
        bw.newLine();
        bw.write("Trzecia linia po znaku konca linii\n");
        bw.write("Linia #4");
        bw.close(); fw.close();
*/
        /*
        Praca domowa (bedzie opisana na github)

        Sciagnac kilka indeksow gieldowych roznych firm i dodac kolumne wzrostu kursu akcji (close-open)/open
        - prasowanie String na int


         */
    }
}
