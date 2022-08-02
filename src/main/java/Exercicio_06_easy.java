import javax.swing.*;

public class Exercicio_06_easy { //Inicio Algoritmo

    static double primeiraNota, segundaNota, mediaNotas;
    public static void main(String[] args) {

        primeiraNota = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota: "));
        segundaNota = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota: "));
        mediaNotas = (primeiraNota + segundaNota) / 2;

        if (mediaNotas > 5) { //Inicio SE
            System.out.println("Aprovado !");
        } //Fim SE
        if (mediaNotas < 5) {
            System.out.print("Reprovado !");
        }
        else if (mediaNotas == 5) {
            System.out.println("Ficou para exame!");
        }
    }
} //Fim algoritmo
