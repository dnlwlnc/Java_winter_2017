package pl.waw.sgh;

import javax.swing.*;

public class GuiWe {
    public static void main(String[] args) {
        boolean koniec = false;

        while (!koniec) {
            String imie = JOptionPane.showInputDialog(null, "Podaj Imie");
            JOptionPane.showMessageDialog(null, "Witaj" + imie);
            int decyzja = JOptionPane.showConfirmDialog(null, "Czy zakonczyc program?");
            if (decyzja == JOptionPane.YES_OPTION) {
                koniec = true;
            }
        }

    }
}
