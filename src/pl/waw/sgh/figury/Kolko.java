package pl.waw.sgh.figury;

public class Kolko extends Figura {
    public Kolko(double parA, double parB) {
        super(parA, parB);
    }

    @Override
    public double policzPole() {
        return Math.PI*Math.pow(parA,2);
    }
}
