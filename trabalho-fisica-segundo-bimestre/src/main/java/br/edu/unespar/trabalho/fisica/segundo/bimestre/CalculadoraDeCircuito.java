package br.edu.unespar.trabalho.fisica.segundo.bimestre;

public class CalculadoraDeCircuito {

    public static ResultadoCalculo calcular(double r1, double r2, double e1, double e2, double e3) throws ArithmeticException {
        if (r1 == 0 || r2 == 0) {
            throw new ArithmeticException("Os valores dos resistores não podem ser zero.");
        }

        double i2 = (e1 - e3) / r2;

        double i1 = (e3 - e2) / r1;

        double v_ab = -r2 * i2;

        return new ResultadoCalculo(i1, i2, v_ab);
    }
}

