package br.edu.unespar.trabalho.fisica.segundo.bimestre;

import javax.swing.SwingUtilities;

public class Aplicacao {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(InterfaceCalculadoraCircuito::new);
    }
}
