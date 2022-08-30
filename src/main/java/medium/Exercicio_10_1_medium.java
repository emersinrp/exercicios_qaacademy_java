package medium;

public class Exercicio_10_1_medium {

    static int elemento, i = 2;
    public static void main(String[] args) {

        elemento = 10;
        int fibonacci[] = new int [elemento];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        while(i<elemento){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            i++;
        }
        i=0;

        while(i < elemento){
            System.out.println("Termo: "+(i+1) + ", valor: " + fibonacci[i]);
            i++;
        }
    }
}
