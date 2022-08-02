import javax.swing.*;

public class Exercicio_10_1_easy {

    static double valorJuros, taxaJuros = 0.05, valorInvestimento, valorTotal;
    static int ano = 1;
    public static void main(String[] args) {

        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor:"));

        while (ano <= 10) {
            valorJuros = valorJuros + (valorInvestimento * taxaJuros);
            ano++;
        }

        valorTotal = valorJuros + valorInvestimento;

        System.out.println("Valor investido R$" + valorInvestimento);
        System.out.println("Valor juros R$"+ valorJuros);
        System.out.println("Valor Total com juros R$" + valorTotal);
    }
}
