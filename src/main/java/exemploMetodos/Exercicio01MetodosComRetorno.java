package exemploMetodos;

public class Exercicio01MetodosComRetorno {

    public static String primeiroMetodo(){
        String mensagem = "teste exercicio primeiro metodo";
        return mensagem;
    }

    public static int segundoMetodo(){
        return 10;
    }

    public static double terceiroMetodo(){
        return 5.5;
    }

    public static boolean quartoMetodo(){
        return true;
    }

    public static String quintoMetodo(){
        return "quinto metodo";
    }

    public static void main(String[] args) {
        System.out.println(primeiroMetodo());
        System.out.println(segundoMetodo());
        System.out.println(terceiroMetodo());
        System.out.println(quartoMetodo());
        System.out.println(quintoMetodo());
    }
}
