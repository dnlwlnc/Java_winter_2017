package pl.waw.sgh.bank;

public class OperNaBanku {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Klient k1 = bank.stworzKlienta("Andrzej", "Kowalski", "akowalski@onet.pl");
        Klient k2 = bank.stworzKlienta("Jan", "Wisniewsi", "jwisnia@wp.pl");
        Konto acc1 = bank.stworzKonto(true, "PLN", k1);
        Konto acc2 = bank.stworzKonto(false, "PLN", k1);
        Konto acc3 = bank.stworzKonto(false, "PLN", k2);

        // UZNANIE, OBCIĄŻENIE, PRZELEW (z konta na konto)
        // IFELSE na sytuacje wyjatkowe -> konto nie istnieje, nie ma srodkow, itd.
        // ZNALEZIENIE konta z listy

        //
    }

}
