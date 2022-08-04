package medium;

public class Exercicio_01_medium { //Inicio algoritmo

    static int i = 0;

    public static void main(String[] args) {

        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println("Este numero:" + i + " é PAR");
            } else {
                System.out.println("Este numero:" + i + " é IMPAR");
            }
            i++;
        }
    }
} //Fim algoritmo - commit
