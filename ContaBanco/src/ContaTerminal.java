import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Cria um objeto Scanner para receber entrada do usuário
        var scanner = new Scanner(System.in);

        // Solicita e recebe o número da agência
        System.out.println("Por favor, digite o número da Agência: ");
        var agencia = scanner.nextInt();

        // Solicita e recebe o número da conta
        System.out.println("Digite o número da conta: ");
        var numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt

        // Solicita e recebe o nome do cliente
        System.out.println("Digite o nome do cliente: ");
        var nomeCliente = scanner.nextLine();

        // Solicita e recebe o saldo da conta
        System.out.println("Digite o saldo da conta: ");
        var saldo = scanner.nextDouble();

        // Exibe a mensagem final com os dados inseridos
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, " +
                "conta %d e seu saldo é R$ %.2f já está disponível para saque. %n", nomeCliente, agencia, numeroConta, saldo);

        // Fecha o scanner
        
        scanner.close();

    }
}
