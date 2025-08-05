package br.edu.unespar.trabalho.fisica.segundo.bimestre;

public class ResultadoCalculo {

    private final double correnteR1;
    private final double correnteR2;
    private final double diferencaPotencialAB;

    public ResultadoCalculo(double correnteR1, double correnteR2, double diferencaPotencialAB) {
        this.correnteR1 = correnteR1;
        this.correnteR2 = correnteR2;
        this.diferencaPotencialAB = diferencaPotencialAB;
    }

    public double getCorrenteR1() {
        return correnteR1;
    }

    public double getCorrenteR2() {
        return correnteR2;
    }

    public double getDiferencaPotencialAB() {
        return diferencaPotencialAB;
    }
}
