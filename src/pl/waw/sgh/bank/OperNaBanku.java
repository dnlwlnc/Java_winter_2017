package pl.waw.sgh.bank;

import java.math.BigDecimal;

public class OperNaBanku {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Bank bank2 = new Bank();
        Klient k1 = bank.stworzKlienta("Andrzej", "Kowalski", "akowalski@onet.pl");
        Klient k2 = bank.stworzKlienta("Jan", "Wisniewsi", "jwisnia@wp.pl");
        Konto acc1 = bank.stworzKonto(true, "PLN", k1);
        Konto acc2 = bank.stworzKonto(true, "PLN", k2);

        // UZNANIE, OBCIĄŻENIE, PRZELEW (z konta na konto)
        // IFELSE na sytuacje wyjatkowe -> konto nie istnieje, nie ma srodkow, itd.
        // ZNALEZIENIE konta z listy


        // TESTOWANIE UZNANIA I OBCIAZENI

        acc1.uznanie(50);
        System.out.println(acc1.stanKonta());

        acc1.obciazenie(60);
        System.out.println(acc1.stanKonta());
        System.out.println(acc2.stanKonta());

        // TESTOWANIE PRZELEWU

        System.out.println(acc1.getKontoId() + " " + acc2.getKontoId());

        acc2.uznanie(50);
        System.out.println("Acc1. " + acc1.stanKonta() + "\nAcc2. " + acc2.stanKonta());
        bank.przelew(0,1,400);
        System.out.println("Acc1. " + acc1.stanKonta() + "\nAcc2. " + acc2.stanKonta());


    }

}