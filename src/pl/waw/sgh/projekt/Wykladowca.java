package pl.waw.sgh.projekt;

import java.util.*;

public class Wykladowca extends Osoba {
    private int idWykladowcy;
    private static int counter;
    private static int limitWykladowcy;
    private List<Przedmiot> przedmiotyWykladowcy;
    private static List<Wykladowca> wszyscyWykladowcy = new ArrayList<>();
    private  Map<String, Boolean> skrzynkaOdbiorcza = new HashMap<>();

    Wykladowca(String imie, String nazwisko, Date birthday) {
        super(imie, nazwisko, birthday);
        idWykladowcy = counter;
        counter++;
        limitWykladowcy = 5;
        wszyscyWykladowcy.add(this);
        this.przedmiotyWykladowcy = new ArrayList<>();
        this.skrzynkaOdbiorcza = new HashMap<>();
    }

    public void wyslijWiadomosc(Student s, String wiadomosc){
        s.getSkrzynkaOdbiorcza().put(wiadomosc, false);
    }

    public void odbierzWiadomosc(){
        for (Map.Entry<String, Boolean> entry : skrzynkaOdbiorcza.entrySet()) {
            if(entry.getValue() == false) {
                System.out.println(entry.getKey());
                skrzynkaOdbiorcza.put(entry.getKey(), true);
            }
        }
    }

    public int wiadomosciNieodebrane(){
        int wiadomosci=0;
        for(Map.Entry<String, Boolean> entry : skrzynkaOdbiorcza.entrySet()){
            if(entry.getValue() == false){
                wiadomosci = wiadomosci+1;
            }
        }

        return wiadomosci;
    }

    public void wystawOcene(Student s, Przedmiot p, int ocena) {
        boolean zapisanyNaPrzedmiot = false;
        for (int i=0; i < s.przedmiotyStudenta.size(); i++) {
            if (p.getNazwa().equals(s.przedmiotyStudenta.get(i).getNazwa())) {
                zapisanyNaPrzedmiot = true;
            }
        }

        if(zapisanyNaPrzedmiot==true){
            s.getOceny().put(p.getNazwa(), ocena);
        }else{
            System.out.println("Student nie jest zapisany na przedmiot " + p.getNazwa());
        }
    }

    public static int getLimitWykladowcy() {
        return limitWykladowcy;
    }

    public static void setLimitWykladowcy(int limitWykladowcy) {
        Wykladowca.limitWykladowcy = limitWykladowcy;
    }

    public int getIdWykladowcy() {
        return idWykladowcy;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Wykladowca.counter = counter;
    }

    public List<Przedmiot> getPrzedmiotyWykladowcy() {
        return przedmiotyWykladowcy;
    }

    public void setPrzedmiotyWykladowcy(List<Przedmiot> przedmiotyWykladowcy) {
        this.przedmiotyWykladowcy = przedmiotyWykladowcy;
    }

    public static List<Wykladowca> getWszyscyWykladowcy() {
        return wszyscyWykladowcy;
    }

    public static void setWszyscyWykladowcy(List<Wykladowca> wszyscyWykladowcy) {
        Wykladowca.wszyscyWykladowcy = wszyscyWykladowcy;
    }


    public void setIdWykladowcy(int idWykladowcy) {
        this.idWykladowcy = idWykladowcy;
    }

    public Map<String, Boolean> getSkrzynkaOdbiorcza() {
        return skrzynkaOdbiorcza;
    }

    public void setSkrzynkaOdbiorcza(Map<String, Boolean> skrzynkaOdbiorcza) {
        this.skrzynkaOdbiorcza = skrzynkaOdbiorcza;
    }


}

