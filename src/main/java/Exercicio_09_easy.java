import javax.swing.*;

public class Exercicio_09_easy { //Inicio Algoritmo

    static int numeroDigitado, i = 1, resultado;

    public static void main(String[] args) {
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que sera multiplicado:"));

            while (i <=10 && numeroDigitado <= 10) {
                resultado = numeroDigitado * i;
                System.out.println(numeroDigitado + "x" + i + "=" + resultado);
                i++;
            }
        }
} // Fim algoritmo
