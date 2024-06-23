import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o Número da Conta: ");
        int numeroConta = scanner.nextInt();


        System.out.println("Por favor, digite o Número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o Nome do Cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o Saldo Inicial: ");
        double saldoConta = scanner.nextDouble();

        System.out.println("Ola " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque");

    }
}
