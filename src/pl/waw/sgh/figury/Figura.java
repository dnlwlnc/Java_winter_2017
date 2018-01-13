package pl.waw.sgh.figury;

public abstract class Figura implements Comparable<Figura>{
    protected double parA;
    protected double parB;
    protected double parC;

    public Figura(double parA, double parB, double parC) {
        ustawParam(parA, parB, parC);
    }

    public Figura(double parA, double parB) {
        ustawParam(parA, parB);
    }

    public Figura(double parA) {
        ustawParam(parA);
    }

    public void ustawParam(double parA, double parB, double parC) {
        this.parA = parA;
        this.parB = parB;
        this.parC = parC;
    }
    public void ustawParam(double parA, double parB) {
        this.parA = parA;
        this.parB = parB;
    }

    public void ustawParam(double parA) {
        this.parA = parA;
    }

    public abstract double policzPole();

    @Override
    public String toString() {
        return super.toString() +
                " Figura o parametrach A=" + parA +
                " i B=" + parB + " i C=" + parC;
    }

    @Override
    public int compareTo(Figura o) {
        return Double.valueOf(policzPole()).compareTo(o.policzPole());
    }
}
