package Polimorfism_Dinamic;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Derivate linearDerivate = new Linear(2, 3, 4);
        Derivate exponentialDerivate = new Exponential(2, 2, 1);

        List<Derivate> list = List.of(linearDerivate, exponentialDerivate);

        for (Derivate derivate : list) {
            System.out.println(derivate.showResult());
            System.out.println("---------------------");
        }
    }
}
