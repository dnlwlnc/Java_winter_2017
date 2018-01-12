package pl.waw.sgh.figury;

public class Kwadrat extends Figura {

    public Kwadrat(double parA) {
        super(parA);
    }

    @Override
    public double policzPole() {
        return parA*parA;
    }
}
