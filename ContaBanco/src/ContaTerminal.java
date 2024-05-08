import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // int numeroConta;
        // String agencia;
        // String nomeCliente;
        // double saldo;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, informe seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, informe o saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá ".concat(nomeCliente)+", obrigado por cria uma conta em nosso banco, sua agência é ".concat(agencia)
        +", conta " + numeroConta + " e seu saldo "+ saldo+" ja esta disponivel para saque.");

    }
}
