package pl.waw.sgh.figury;

public class Trojkat extends Figura {
    public Trojkat(double parA, double parB, double parC) {
        super(parA, parB, parC);
    }

    @Override
    public double policzPole() {
        double p = 0.5*(parA + parB + parC);
        return Math.sqrt(p*(p-parA)*(p-parB)*(p-parC));
    }

}
