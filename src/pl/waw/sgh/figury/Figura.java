package pl.waw.sgh.figury;

/* Poziomy dostepnosci:
*  Public
*  Private - dostępna tylko wew. klasy
*  default (bez adnotacji) - dostep do wszystkich z danej paczki
*  protected - dla danej strukutry
*  */

public class Figura {
    double parA;
    double parB;

    /*public Prostokat {

    }*/

    public Figura(double parA, double parB) {
        ustawParam(parA, parB);
    }

    public void ustawParam(double parA, double parB) {
        this.parA = parA;
        this.parB = parB;
    }

    public double policzPole() {
        return parA * parB;
    }

    @Override
    public String toString() {
        // super.toString() - super odnosi sie do rodzica
        // @Override pilnuje abysmy faktycznie nadpisywali metode, a nie tworzyli nowa (np. robiac literowke)

        return "Figura o parametrach A: " + parA + ", B: " + parB;
    }
}
