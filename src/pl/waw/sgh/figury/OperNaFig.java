package pl.waw.sgh.figury;

import java.util.*;

public class OperNaFig {
    public static void main(String[] args) {

        Prostokat p1 = new Prostokat(24,5);
        System.out.println(p1 + " \npole: " + p1.policzPole());
        //Figura f1 = new Figura(3,35);
        Kolko k1 = new Kolko(3,0);
        System.out.println("Koło: " + k1 + " " + k1.policzPole());
        //f1.

        // NOWE FIGURY
        Kwadrat square = new Kwadrat(5);
        System.out.println("Kwadrat: " + square + ". Pole: " + square.policzPole());
        Trojkat triangle = new Trojkat(5, 6, 7);
        System.out.println("Trojkat: " + triangle + ". Pole: " + triangle.policzPole());
        TrojkatRownoboczny eqTriangle = new TrojkatRownoboczny(5);
        System.out.println("Trojkat rownoboczny: " + eqTriangle + ". Pole: " + eqTriangle.policzPole());

        Figura[] tabFig = new Figura[5];
        tabFig[0] = p1;
        tabFig[1] = k1;
        tabFig[2] = square;
        tabFig[3] = triangle;
        tabFig[4] = eqTriangle;

        for (Figura f : tabFig) {
            System.out.println(f + " " + f.policzPole());
        }

//        Set<Figura> figuraSet = new HashSet<>();
//        figuraSet.addAll(Arrays.asList(tabFig));

        Arrays.sort(tabFig);
        List<Figura> figuraList = new ArrayList<>();
        figuraList.addAll(Arrays.asList(tabFig));
        for (Figura f : figuraList) {
            System.out.println(f + " " + f.policzPole());
        }
    }
}
