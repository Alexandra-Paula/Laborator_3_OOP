package Abstractizare;

public class AngajatConcediuPlat extends Angajat {

    public AngajatConcediuPlat(double salariuDeBaza) {
        super(salariuDeBaza);
    }

    @Override
    public double calculeazaSalariu() {
        // Salariul este platit integral fara bonus
        return salariuDeBaza;
    }
}
