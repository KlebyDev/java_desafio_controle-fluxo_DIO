import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmentro: ");
        int primeiroParamentro = entrada.nextInt();
        
        System.out.println("Digite o segundo parâmentro: ");
        int segundoParamentro = entrada.nextInt();

        entrada.close();

        try {
            contar(primeiroParamentro, segundoParamentro);
        } catch (ParamentrosInvalidosException e) {
            System.out.println(e);
        }
    }

    public static void contar(int paramentro1, int paramentro2) throws ParamentrosInvalidosException{
        int qtdInteracoes = paramentro2 - paramentro1;
        
        if(qtdInteracoes <= 0 ) throw new ParamentrosInvalidosException();

        for(int i=1 ; i <= qtdInteracoes ; i++){
            System.out.println("Imprimindo o número "+ i);
        }
    }
}
