package org.example.variaveis;

import javax.swing.*;

public class Jantar {
    public static void main(String[] args) {
        final double taxa_garcom = 0.1; //constante
        double valor_jantar, valor_jantar_total; //variáveis
        valor_jantar = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do jantar"));
        valor_jantar_total = valor_jantar + (taxa_garcom * valor_jantar);
        JOptionPane.showMessageDialog(null, "O valor total do jantar a ser pago é de "+valor_jantar_total);
    }
}
