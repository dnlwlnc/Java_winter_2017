package pl.waw.sgh.figury;

public class TrojkatRownoboczny extends Figura {

    public TrojkatRownoboczny(double parA) {
        super(parA);
    }

    @Override
    public double policzPole() {
        return (Math.pow(parA, 2)*Math.sqrt(3))/4;
    }
}
