package Abstractizare;

public class AngajatStandard extends Angajat {

    public AngajatStandard(double salariuDeBaza) {
        super(salariuDeBaza);
    }

    @Override
    public double calculeazaSalariu() {
        return salariuDeBaza;
    }
}
