package medium;

public class Exercicio_06_medium {

    static int fatorial, i;
    public static void main(String[] args) {

        fatorial = 10;
        i = fatorial;

        while(i>1){
            fatorial = fatorial * (i-1);
            i--;
        }
        System.out.println("O fatorial do numero digitado é: " + fatorial);
    }
}
