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

    public Konto znajdzKonto(Integer idKonta) {
        for (int i = 0; i < this.listaKont.size(); i++) {
            Konto sprawdzaneKonto = this.listaKont.get(i);
            if (sprawdzaneKonto.getKontoId().equals(idKonta)) {
                return sprawdzaneKonto;
            }
        }
        return  null;
    }

    public void przelew(Integer numerKontaNadawcy, Integer numerKontaOdbiorcy, Number kwotaPrzelewu) {
        Konto nadawca = znajdzKonto(numerKontaNadawcy);
        Konto odbiorca = znajdzKonto(numerKontaOdbiorcy);

        if (nadawca != null && odbiorca != null) {
            if (nadawca.getStan().compareTo(BigDecimal.ZERO) > 0
                    && nadawca.getStan().compareTo(new BigDecimal(kwotaPrzelewu.toString())) >= 0) {
                nadawca.obciazenie(kwotaPrzelewu);
                odbiorca.uznanie(kwotaPrzelewu);
            } else {
                System.out.println("Brak wystarczających srodkow na koncie nadawcy.");
            }

        } else {
            if (nadawca == null) {
                System.out.println("Numer konta nadawcy nie istnieje. ");
            }

            if (odbiorca == null) {
                System.out.println("Numer konta odbiorcy nie istnieje. ");
            }
        }
    }
}
