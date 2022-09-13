package medium;

import javax.swing.*;

public class Execucao_exercicios_medium {

    public static void main(String[] args) {
        int selecionaExercicio;
        selecionaExercicio = Integer.parseInt(JOptionPane.showInputDialog("Informe o exercicio a ser executado: "));

        if (selecionaExercicio == 1){
            int valorInformado = Integer.parseInt(JOptionPane.showInputDialog("Descubra se seu numero é impar ou par:"));
            Exercicio_01_medium ex01_medium = new Exercicio_01_medium();
            ex01_medium.exibeParOuImpar(valorInformado);
        }
    }
}
