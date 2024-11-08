package Abstractizare;

public class AngajatCuBonus extends Angajat implements Beneficii {
    private double bonus;

    public AngajatCuBonus(double salariuDeBaza, double bonus) {
        super(salariuDeBaza);
        this.bonus = bonus;
    }

    @Override
    public void aplicaBeneficiu() {
        salariuDeBaza += bonus;
    }

    @Override
    public double calculeazaSalariu() {
        aplicaBeneficiu();
        return salariuDeBaza;
    }
}
