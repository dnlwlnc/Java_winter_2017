package pl.waw.sgh.projekt;

import java.util.*;

public class Student extends Osoba {
    private int idStudenta;
    private int licznik;
    private double sredniaOcen;
    public List<Przedmiot> przedmiotyStudenta;
    private static List<Student> wszyscyStudenci = new ArrayList<>();
    private Map<String, Integer> oceny = new HashMap<>();
    private Map<String, Boolean> skrzynkaOdbiorcza = new HashMap<>();

    Student(String imie, String nazwisko, Date birthday) {
        super(imie, nazwisko, birthday);
        this.idStudenta = licznik;
        licznik++;
        this.sredniaOcen = 0;
        this.przedmiotyStudenta = new ArrayList<>();
        this.oceny = new HashMap<>();
        wszyscyStudenci.add(this);
        this.oceny = new HashMap<>();
        this.skrzynkaOdbiorcza = new HashMap<>();
    }

    public void zapiszNaPrzedmiot(Przedmiot p, Wykladowca w){
        boolean prowadziPrzedmiot = false;

        for (int i = 0; i < w.getPrzedmiotyWykladowcy().size(); i++){
            if (w.getPrzedmiotyWykladowcy().get(i).getNazwa().equals(p.getNazwa())){
                prowadziPrzedmiot = true;
            }
        }

        if (p.getLimitMiejsc() == 0) {
            System.out.println("Nie ma juz miejsc na ten przedmiot.");
        }else if (prowadziPrzedmiot == false){
            System.out.println("Prowadzący nie prowadzi tego przedmiotu.");
        }else{
            przedmiotyStudenta.add(p);
            p.setLimitMiejsc(p.getLimitMiejsc()-1);
        }
    }


/*
    public void wystawOcenę(Przedmiot p, int ocena) {
        boolean zapisanyNaPrzedmiot = false;
        for(int i=0; i < przedmiotyStudenta.size(); i++){
            if(p.getNazwa().equals(przedmiotyStudenta.get(i).getNazwa())){
                zapisanyNaPrzedmiot = true;
            }
        }

        if(zapisanyNaPrzedmiot==true){
            oceny.put(p.getNazwa(), ocena);
        }else{
            System.out.println("Student nie jest zapisany na przedmiot.");
        }
    }*/

    public double wyswietlOcene(Przedmiot p) {
        try {
            return oceny.get(p.getNazwa());
        } catch (NullPointerException npe) {
            System.out.println("Student nie ma oceny z tego przedmiotu.");
            return 0;
        }
    }

    public void wyswietlOcene(){
        if(oceny.isEmpty()==false){
            for (Map.Entry<String, Integer> entry : oceny.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

    public double sredniaOcen() {
        if(oceny.size()==0){
            System.out.println("Student nie ma ocen.");
            return 0;
        }else{
            sredniaOcen = 0;
            for (Map.Entry<String, Integer> entry : oceny.entrySet()) {
                sredniaOcen += entry.getValue();
            }
            return sredniaOcen / oceny.size();
        }
    }

    public void wyslijWiadomosc(Wykladowca w, String wiadomosc){
        w.getSkrzynkaOdbiorcza().put(wiadomosc, false);
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

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    public int getIdStudenta() {
        return idStudenta;
    }

    public void setIdStudenta(int idStudenta) {
        this.idStudenta = idStudenta;
    }

    public int getLicznik() {
        return licznik;
    }

    public void setLicznik(int licznik) {
        this.licznik = licznik;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public List<Przedmiot> getPrzedmiotyStudenta() {
        return przedmiotyStudenta;
    }

    public void setPrzedmiotyStudenta(List<Przedmiot> przedmiotyStudenta) {
        this.przedmiotyStudenta = przedmiotyStudenta;
    }

    public static List<Student> getWszyscyStudenci() {
        return wszyscyStudenci;
    }

    public static void setWszyscyStudenci(List<Student> wszyscyStudenci) {
        Student.wszyscyStudenci = wszyscyStudenci;
    }

    public Map<String, Integer> getOceny() {
        return oceny;
    }

    public void setOceny(Map<String, Integer> oceny) {
        this.oceny = oceny;
    }


    public Map<String, Boolean> getSkrzynkaOdbiorcza() {
        return skrzynkaOdbiorcza;
    }

    public void setSkrzynkaOdbiorcza(Map<String, Boolean> skrzynkaOdbiorcza) {
        this.skrzynkaOdbiorcza = skrzynkaOdbiorcza;
    }


}
