package Polimorfism_Dinamic;

public class Linear extends Derivate {
    private double a;
    private double b;

    public Linear(double x, double a, double b){
        super(x);
        this.a = a;
        this.b = b;
    }
    @Override
    public double calculateDerivata(){
        //(ax+b)=a
        return a;
    }
    @Override
    public String showResult(){
        return "Linear Derivative Result: " + calculateDerivata();
    }
}
