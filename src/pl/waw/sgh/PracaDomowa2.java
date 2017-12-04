package pl.waw.sgh;

import java.io.*;
import java.util.Scanner;

public class PracaDomowa2 {

    static final String PLIK = "./CSV"; // Folder z plikami CSV
    public static void main(String[] args) throws IOException {

        calculateChange(PLIK);

    }

    public static void calculateChange(String file) throws IOException {

        File dir = new File(file);

        try {
            if (dir.isDirectory()) {
                File[] pliki = dir.listFiles();
                for (File plik : pliki) {
                    addChangeColumn(plik);
                }
            }

        } catch (Exception e) {
            System.out.println("Wskazana ścieżka nie prowadzi do do folderu.");
        }


    }

    public static void addChangeColumn(File file) throws IOException {
        File inputFile = file;
        File outputFile = new File(createOutputFileName(inputFile));
        FileWriter fw = new FileWriter(outputFile);
        BufferedWriter bw = new BufferedWriter(fw);
        String separator = ",";
        Scanner scanner = new Scanner(inputFile);

        int counter = 0;
        int positionCounter = 0;
        int openPosition = 0 ;
        int closePosition = 0;

        while (scanner.hasNext()) {
            if (counter == 0) {
                String row = scanner.nextLine();
                String[] column = row.split(separator);
                for (String element : column){
                    if (element.equals("Open")) {
                        openPosition = positionCounter;
                    } else if (element.equals("Close")) {
                        closePosition = positionCounter;
                    }
                    positionCounter++;
                }
                bw.write(row+separator+"Change\n");
            } else {
                String row = scanner.nextLine();
                String[] columns = row.split(separator);
                float open = Float.valueOf(columns[openPosition]);
                float close = Float.valueOf(columns[closePosition]);
                float change = ((close-open)/open)*100;
                bw.write(row+separator+change+"\n");
            }
            counter += 1;
        }
        bw.close();
        fw.close();

        System.out.println(createOutputFileName(inputFile));
    }
    public static String createOutputFileName(File inputFile) {
        String inputName;
        String fileExtension;
        String outputName;
        if (inputFile.exists()) {
            inputName = inputFile.getName().toString();
            fileExtension = inputName.substring(inputName.lastIndexOf("."), inputName.length());
        } else {
            return "Plik nie istnieje";
        }

        if (fileExtension.equals(".csv")) {
            outputName = inputName.substring(0, inputName.lastIndexOf(".")).concat("_1.csv");
            return outputName;
        } else {
            return "Plik nie jest plikiem *.csv";
        }
    }
}
