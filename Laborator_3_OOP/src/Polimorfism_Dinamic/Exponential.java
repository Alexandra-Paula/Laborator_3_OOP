package Polimorfism_Dinamic;

public class Exponential extends Derivate{
    private double a;
    private double b;

    public Exponential(double x, double a, double b) {
        super(x);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateDerivata() {
        // Derivata (ae^(bx)) = a * b * e^(bx)
        return a * b * Math.exp(b * super.getX());
    }

    @Override
    public String showResult() {
        return "Exponential Derivative Result: " + calculateDerivata();
    }
}
