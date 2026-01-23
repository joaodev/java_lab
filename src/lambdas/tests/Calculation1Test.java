package lambdas.tests;

import lambdas.MultiplyCalculation;
import lambdas.SumCalculation;
import lambdas.interfaces.Calculation;

public class Calculation1Test {

    public static void main(String[] args) {

        Calculation calculation = new SumCalculation();
        System.out.println(calculation.execute(5, 6));

        calculation = new MultiplyCalculation();
        System.out.println(calculation.execute(12, 4));
    }
}
