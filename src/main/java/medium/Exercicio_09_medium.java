package medium;

import javax.swing.*;

public class Exercicio_09_medium {

    static int i = 0;
    public static void main(String[] args) {

        String [] nomeAlunosVetor = new String [5];
        int [] numeroAlunosVetor = new int [5];

        while(i<5){
            nomeAlunosVetor[i] = JOptionPane.showInputDialog("Digite o nome do aluno: ");
            System.out.println(nomeAlunosVetor[i]);
            numeroAlunosVetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do aluno: "));
            System.out.println(numeroAlunosVetor[i]);
            i++;
        }
        i = 0;

        while(i<5){
            System.out.println("Nome do aluno: "+ nomeAlunosVetor[i] + " - Numero do aluno: " + numeroAlunosVetor[i]);
            i++;
        }
    }
}
