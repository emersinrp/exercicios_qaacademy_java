package exemploMetodos;

public class ExemploMetodoComRetorno {

    public static String exemploMetodoComRetorno(){
        String mensagem = "exercicio primeiro metodo com retorno";
        return mensagem;
    }

    public static void main(String[] args) {
        Exercicio01MetodosComRetorno exercicio01Retorno = new Exercicio01MetodosComRetorno();

        System.out.println(exemploMetodoComRetorno());
        System.out.println(exercicio01Retorno.primeiroMetodo());
        System.out.println(exercicio01Retorno.segundoMetodo());
    }

}
