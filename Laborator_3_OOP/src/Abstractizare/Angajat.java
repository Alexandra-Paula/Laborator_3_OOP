package Abstractizare;

public abstract class Angajat {
    protected double salariuDeBaza;

    public Angajat(double salariuDeBaza) {
        this.salariuDeBaza = salariuDeBaza;
    }

    // Metoda abstractă pentru a calcula salariul
    public abstract double calculeazaSalariu();
}
