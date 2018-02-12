package pl.waw.sgh.projekt;

import java.util.Date;

public abstract class Osoba {
    private String imie;
    private String nazwisko;
    private Date urodziny;

    Osoba(String imie, String nazwisko, Date urodziny) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.urodziny = urodziny;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Date getUrodziny() {
        return urodziny;
    }

    public void setUrodziny(Date urodziny) {
        this.urodziny = urodziny;
    }

}
