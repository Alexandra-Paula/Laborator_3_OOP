package Polimorfism_Dinamic;

public class Derivate {
    private double x;

    public Derivate(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public double calculateDerivata() {
        return 0.0;
    }

    public String showResult() {
        return "Derivative result: " + calculateDerivata();
    }
}

