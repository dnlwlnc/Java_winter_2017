package pl.waw.sgh.obj;

public class Prostokat {
    double parA;
    double parB;

    /*public Prostokat {

    }*/

    public Prostokat(double parA, double parB) {
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

        return "Prostokat o bokach A: " + parA + ", B: " + parB;
    }
}
