package pl.waw.sgh.bank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private Integer ostatniKlientId = 0;
    private Integer ostatnieKontoId = 0;
    private List<Klient> listaKlient = new ArrayList<>();
    private List<Konto> listaKont = new ArrayList<>();

    // Wzorzec fabryki

    public Klient stworzKlienta(String imie, String nazwisko, String email) {
        Klient kl = new Klient(ostatniKlientId++, imie, nazwisko, email);
        listaKlient.add(kl);
        return kl;
    }

    public Konto stworzKonto(boolean czyRor, String waluta, Klient klient) {
        Konto konto = czyRor
                ? new KontoRor(ostatnieKontoId++, waluta, new BigDecimal(0), klient)
                : new KontoOszcz(ostatnieKontoId++, waluta, new BigDecimal(0), klient);
        listaKont.add(konto);
        return konto;
    }
}
