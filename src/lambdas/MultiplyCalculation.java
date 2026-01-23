package lambdas;

import lambdas.interfaces.Calculation;

public class MultiplyCalculation implements Calculation {

    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}
