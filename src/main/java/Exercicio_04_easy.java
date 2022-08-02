import javax.swing.*;

public class Exercicio_04_easy { //Inicio Algoritmo

    static int numeroDigitado, resultado;

    public static void main(String[] args) {

        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero que sera multiplicado: "));
        resultado = numeroDigitado * 2;
        System.out.println ("O dobro do valor digitado é :" + resultado);

    }
} // Fim algoritmo
