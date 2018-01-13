package pl.waw.sgh.bank;

public class OperNaBanku {
    Bank bank = new Bank();
    Klient k1 = bank.stworzKlienta("Andrzej", "Kowalski", "akowalski@onet.pl");
    Klient k2 = bank.stworzKlienta("Jan", "Wisniewsi", "jwisnia@wp.pl");
    Konto acc1 = bank.stworzKonto(true, "PLN", k1);
    Konto acc2 = bank.stworzKonto(false, "PLN", k1);
    Konto acc3 = bank.stworzKonto(false, "PLN", k2);
}
