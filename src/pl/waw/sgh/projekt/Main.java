package pl.waw.sgh.projekt;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Wykladowca kowalski = new Wykladowca("Eugeniusz", "Kowalski", new Date(1970, 8, 9));
        Wykladowca nowak = new Wykladowca("Jan", "Nowak", new Date(1988, 10, 25));

        Przedmiot matematyka = new Przedmiot("Matematyka", 2, kowalski);
        Przedmiot polski = new Przedmiot("Polski", 2, kowalski);
        Przedmiot przyroda = new Przedmiot("Przyroda", 2, kowalski);
        Przedmiot wf = new Przedmiot("WF", 2, kowalski);
        Przedmiot przedsiebiorczosc = new Przedmiot("Przedsiebiorczosc", 2, kowalski);
        Przedmiot informatyka = new Przedmiot("Informatyka", 2, kowalski);


        Student welenc = new Student("Daniel", "Welenc", new Date(1990, 8, 9));
        Student bak = new Student("Kamil", "Bąk", new Date(1990, 12, 20));
        Student lewandowski = new Student("Robert", "Lewandowski", new Date(1988, 8, 21));

        kowalski.wystawOcene(welenc, matematyka, 3);

        welenc.zapiszNaPrzedmiot(matematyka, kowalski);
        welenc.zapiszNaPrzedmiot(polski, kowalski);
        welenc.zapiszNaPrzedmiot(przyroda, kowalski);
        bak.zapiszNaPrzedmiot(matematyka, kowalski);
        bak.zapiszNaPrzedmiot(polski, kowalski);
        bak.zapiszNaPrzedmiot(przyroda, kowalski);
        lewandowski.zapiszNaPrzedmiot(matematyka, kowalski);

        kowalski.wystawOcene(welenc, matematyka, 5);
        kowalski.wystawOcene(welenc, polski, 3);
        kowalski.wystawOcene(welenc, wf, 3);
        kowalski.wystawOcene(welenc, przyroda, 4);

        welenc.wyswietlOcene();
        System.out.println("Ocena z matematyki to: " + welenc.wyswietlOcene(matematyka));
        System.out.println("Srednia ocen Welenca to: " + welenc.sredniaOcen());


        welenc.wyslijWiadomosc(kowalski, "Wiadomosc #1");
        welenc.wyslijWiadomosc(kowalski, "Wiadomosc #2");
        welenc.wyslijWiadomosc(kowalski, "Wiadomosc #3");
        bak.wyslijWiadomosc(kowalski, "Wiadomosc #4");

        System.out.println("Kowalski, liczba nieodebranych wiadomości: " + kowalski.wiadomosciNieodebrane());
        System.out.println("Welenc, liczba nieodebranych wiadomosci: " + welenc.wiadomosciNieodebrane());
        kowalski.odbierzWiadomosc();

        kowalski.wyslijWiadomosc(welenc, "Nie zdał pan!");
        System.out.println("Kowalski, liczba nieodebranych wiadomości: " + kowalski.wiadomosciNieodebrane());
        System.out.println("Welenc, liczba nieodebranych wiadomosci " + welenc.wiadomosciNieodebrane());
        welenc.odbierzWiadomosc();


    }
}
