package pl.waw.sgh.projekt;

import java.util.Date;

public abstract class Osoba {
    private String imie;
    private String nazwisko;
    private Date birthday;

    Osoba(String imie, String nazwisko, Date birthday) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.birthday=birthday;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
