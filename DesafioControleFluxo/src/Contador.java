import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        var parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parametro: ");
        var parametroDois = terminal.nextInt();

        try {
            // Chamando o metodo contendo a logica de contagem
            contar(parametroUm, parametroDois);
        } catch (IllegalArgumentException e) {
            // Capturar e exibir a mensagem de exeção
            System.out.println(e.getMessage());
        } finally {
            terminal.close();
        }

    }

    static void contar(int parametroUm, int parametroDois) {
        // Validar se parametroUm é maior que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new IllegalArgumentException("O segundo parametro deve ser maior que o primeiro.");
        }
        int contagem = parametroDois - parametroUm;
        int contador = 0;

        for (int i = 0; i < contagem; i++) {
            int valor = parametroUm + contador;
            contador++;
            System.out.println("Imprimindo numero " + contador + ": " + valor);
        }
    }
}
