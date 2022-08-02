import javax.swing.*;

public class Exercicio_05_easy { //Inicio algoritmo

    static int valorInformado1, valorInformado2, valorInformado3, soma, subtracao, multiplicacao, divisaoMedia;
    public static void main(String[] args) {

        valorInformado1= Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        valorInformado2= Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        valorInformado3= Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor: "));

        soma = valorInformado1 + (valorInformado2 + valorInformado3);
        subtracao = valorInformado1 - valorInformado2 - valorInformado3;
        multiplicacao = (valorInformado1 * valorInformado2) * valorInformado3;
        divisaoMedia = (soma / 3);

        System.out.println("Valores: " + "\n Soma: " + soma + "\n Subtração: " + subtracao +
                "\n Multiplicação: " + multiplicacao + "\n Média: " + divisaoMedia);

    }
} // Fim algoritmo
