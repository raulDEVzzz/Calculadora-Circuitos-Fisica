package br.edu.unespar.trabalho.fisica.segundo.bimestre;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class InterfaceCalculadoraCircuito extends JFrame {

    private final JTextField campoR1 = new JTextField("100", 5);
    private final JTextField campoR2 = new JTextField("50", 5);
    private final JTextField campoE1 = new JTextField("6.0", 5);
    private final JTextField campoE2 = new JTextField("5.0", 5);
    private final JTextField campoE3 = new JTextField("4.0", 5);

    private final JTextArea areaResultado = new JTextArea(5, 20);
    private final JButton botaoCalcular = new JButton("Calcular");

    public InterfaceCalculadoraCircuito() {
        setTitle("Calculadora de Circuito Elétrico");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel painelEntradas = new JPanel();
        painelEntradas.setLayout(new GridLayout(5, 2, 5, 5));
        painelEntradas.setBorder(BorderFactory.createTitledBorder("Valores de Entrada"));
        painelEntradas.add(new JLabel("Resistor R₁ (Ω):"));
        painelEntradas.add(campoR1);
        painelEntradas.add(new JLabel("Resistor R₂ (Ω):"));
        painelEntradas.add(campoR2);
        painelEntradas.add(new JLabel("Fonte ε₁ (V):"));
        painelEntradas.add(campoE1);
        painelEntradas.add(new JLabel("Fonte ε₂ (V):"));
        painelEntradas.add(campoE2);
        painelEntradas.add(new JLabel("Fonte ε₃ (V):"));
        painelEntradas.add(campoE3);

        JPanel painelResultados = new JPanel(new BorderLayout());
        painelResultados.setBorder(BorderFactory.createTitledBorder("Resultados"));
        areaResultado.setEditable(false);
        areaResultado.setFont(new Font("Monospaced", Font.BOLD, 14));
        JScrollPane scrollPane = new JScrollPane(areaResultado);
        painelResultados.add(scrollPane, BorderLayout.CENTER);

        JPanel painelBotao = new JPanel();
        painelBotao.add(botaoCalcular);

        add(painelEntradas, BorderLayout.NORTH);
        add(painelResultados, BorderLayout.CENTER);
        add(painelBotao, BorderLayout.SOUTH);

        botaoCalcular.addActionListener(new AcaoCalcular());

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
        botaoCalcular.doClick();
    }

    private class AcaoCalcular implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double r1 = Double.parseDouble(campoR1.getText());
                double r2 = Double.parseDouble(campoR2.getText());
                double e1 = Double.parseDouble(campoE1.getText());
                double e2 = Double.parseDouble(campoE2.getText());
                double e3 = Double.parseDouble(campoE3.getText());

                ResultadoCalculo resultado = CalculadoraDeCircuito.calcular(r1, r2, e1, e2, e3);
                
                DecimalFormat df = new DecimalFormat("0.000");

                String textoResultado = "Resultados para os valores fornecidos:\n\n" +
                        "(a) Corrente em R₁ (I₁):\n" +
                        "    I₁ = " + df.format(resultado.getCorrenteR1()) + " A\n\n" +
                        "(b) Corrente em R₂ (I₂):\n" +
                        "    I₂ = " + df.format(resultado.getCorrenteR2()) + " A\n\n" +
                        "(c) Diferença de Potencial V_ab (Va - Vb):\n" +
                        "    V_ab = " + df.format(resultado.getDiferencaPotencialAB()) + " V";
                
                areaResultado.setText(textoResultado);
                areaResultado.setForeground(Color.BLACK);

            } catch (NumberFormatException ex) {
                areaResultado.setText("ERRO:\nPor favor, insira valores numéricos válidos.");
                areaResultado.setForeground(Color.RED);
            } catch (ArithmeticException ex) {
                areaResultado.setText("ERRO:\n" + ex.getMessage());
                areaResultado.setForeground(Color.RED);
            }
        }
    }
}