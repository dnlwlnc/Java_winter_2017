package pl.waw.sgh.obj;

public class OperacjeNaProstokatach {
    public static void main(String[] args) {
        // Prostokat p1 = new Prostokat(); //po utworzeniu konstruktora konstruktr domyslny nie dziala
        Prostokat p1 = new Prostokat(24, 3);
        // p1.ustawParam(24, 3); // w konstruktorze jest juz taka metoda
        System.out.println("Pole p1: " + p1.policzPole());

        System.out.println(p1.toString());
        // bez implementacji toString() w klasie Prostokat, to nie pokaze nic waznego
        // po nadpisaniu metody toString, odniesienie sie do oryginalnej metody, nie jest juz mozliwe


    }
}
