package pl.waw.sgh.projekt;

import java.util.ArrayList;
import java.util.List;

public class Przedmiot {
    private String nazwa;
    private int idPrzedmiotu;
    private int counter;
    private int limitMiejsc;
    private static List<Przedmiot> wszystkiePrzedmioty = new ArrayList<>();
    private int idWykladowcy;

    Przedmiot(String nazwa, int limitMiejsc, Wykladowca w) {
        if (w.getLimitWykladowcy() != 0){
            this.nazwa = nazwa;
            this.idPrzedmiotu = counter;
            counter++;
            this.limitMiejsc = limitMiejsc;
            this.wszystkiePrzedmioty.add(this);
            w.getProwadzonePrzedmioty().add(this);
            w.setLimitWykladowcy(w.getLimitWykladowcy()-1);
            this.idWykladowcy = w.getIdWykladowcy();
        }else {
            System.out.println("Wykładowca nie może prowadzić więcej przedmiotów");
        }
    }

    public void wyswietlWykladowce(){
        System.out.println(Wykladowca.getWszyscyWykladowcy().get(this.idWykladowcy).getNazwisko());
    }
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIdPrzedmiotu() {
        return idPrzedmiotu;
    }

    public void setIdPrzedmiotu(int idPrzedmiotu) {
        this.idPrzedmiotu = idPrzedmiotu;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getLimitMiejsc() {
        return limitMiejsc;
    }

    public void setLimitMiejsc(int limitMiejsc) {
        this.limitMiejsc = limitMiejsc;
    }

    public static List<Przedmiot> getWszystkiePrzedmioty() {
        return wszystkiePrzedmioty;
    }

    public static void setWszystkiePrzedmioty(List<Przedmiot> wszystkiePrzedmioty) {
        Przedmiot.wszystkiePrzedmioty = wszystkiePrzedmioty;
    }

    public int getIdWykladowcy() {
        return idWykladowcy;
    }

    public void setIdWykladowcy(int idWykladowcy) {
        this.idWykladowcy = idWykladowcy;
    }
}
