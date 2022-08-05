package medium;

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio_02_medium { //Inicio Algoritmo

    static double valorInvestimento, taxaJuros = 0.05, totalAtualizadoComJuros;
    static int i=1, tempoInvestido = 10;
    static DecimalFormat df = new DecimalFormat("##,###.##");
    public static void main(String[] args) {

        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento"));
        totalAtualizadoComJuros = valorInvestimento;

        while(i <= tempoInvestido){//Inicio Enquanto
            totalAtualizadoComJuros = (totalAtualizadoComJuros * taxaJuros) + totalAtualizadoComJuros;

            i++;
        }//Fim Enquanto

        System.out.println("O valor do investimento foi de: " + df.format(valorInvestimento));
        System.out.println("O valor dos juros são: " + df.format(totalAtualizadoComJuros - valorInvestimento));
        System.out.println("O valor total do investimento: " + df.format(totalAtualizadoComJuros));

    }
} //Fim algoritmo
