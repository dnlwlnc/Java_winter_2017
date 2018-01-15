package pl.waw.sgh.bank;

import java.math.BigDecimal;

public abstract class Konto {
    private Integer kontoId;
    private String waluta;
    private BigDecimal stan;
    private Klient klient;

    public Konto(Integer kontoId, String waluta, BigDecimal stan, Klient klient) {
        this.kontoId = kontoId;
        this.waluta = waluta;
        this.stan = BigDecimal.ZERO;
        //this.stan = stan;
        this.klient = klient;
    }

    public void obciazenie(Number kwotaObciazenia){
        BigDecimal obciazenie = new BigDecimal(kwotaObciazenia.toString());
        if (getStan().compareTo(obciazenie) < 0 || obciazenie.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Brak wystarczających środków na koncie lub niepoprawna kwota obciazenia. "
                    + this.stanKonta());
        } else {
            this.setStan(this.getStan().subtract(obciazenie));
        }
    }

    public void uznanie(Number kwotaUznania){
        BigDecimal uznanie = new BigDecimal(kwotaUznania.toString());
        if (uznanie.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Niepoprawna kwota uznania.");
        } else{
            this.setStan((this.getStan().add(uznanie)));
        }
    }

    public String stanKonta() {
        return "Aktualny stan konta to: " + getStan() + " " + this.waluta + ".";
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "kontoId=" + kontoId +
                ", waluta='" + waluta + '\'' +
                ", stan=" + stan +
                ", klient=" + klient +
                '}';
    }


    public Integer getKontoId() {
        return kontoId;
    }

    public void setKontoId(Integer kontoId) {
        this.kontoId = kontoId;
    }

    public String getWaluta() {
        return waluta;
    }

    public void setWaluta(String waluta) {
        this.waluta = waluta;
    }

    public BigDecimal getStan() {
        return stan;
    }

    private void setStan(BigDecimal stan) {
        this.stan = stan;
    }


    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }
}
