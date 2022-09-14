package medium;

import easy.Exercicio_02_easy;

import javax.swing.*;
import java.text.DecimalFormat;

public class Execucao_exercicios_medium {

    public static void main(String[] args) {
        int selecionaExercicio;
        selecionaExercicio = Integer.parseInt(JOptionPane.showInputDialog("Informe o exercicio a ser executado: "));

        if (selecionaExercicio == 1){
            int valorInformado = Integer.parseInt(JOptionPane.showInputDialog("Descubra se seu numero é impar ou par:"));
            Exercicio_01_medium ex01_medium = new Exercicio_01_medium();
            ex01_medium.exibeParOuImpar(valorInformado);
        }

        if (selecionaExercicio == 2){
            DecimalFormat df = new DecimalFormat("##,###.##");
            Exercicio_02_medium ex02_medium = new Exercicio_02_medium();
            double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento"));
            double valorJuros = ex02_medium.calculaInvestimentoJurosCompostos(valorInvestimento);
            double valorTotal = ex02_medium.calculaValorTotalInvestimento(valorInvestimento, valorJuros);
            System.out.println("O valor do investimento foi de: " + df.format(valorInvestimento));
            System.out.println("O valor dos juros são: " + df.format(valorJuros));
            System.out.println("O valor total do investimento: " + df.format(valorTotal));
        }

        if (selecionaExercicio == 3){
            Exercicio_03_medium ex03_medium = new Exercicio_03_medium();
            ex03_medium.somarNumerosAcumulados();
        }

        if (selecionaExercicio == 4){
            Exercicio_04_medium ex04_medium = new Exercicio_04_medium();
            ex04_medium.multiplicaNumerosAteMil();
        }

        if (selecionaExercicio == 5){
            Exercicio_05_medium ex05_medium = new Exercicio_05_medium();
            int menorNumero = ex05_medium.verificaMenorNumero();
            System.out.println("O numero " + menorNumero + " é o menor");
        }
    }
}
