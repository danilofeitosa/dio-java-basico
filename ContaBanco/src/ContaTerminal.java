import java.net.SocketPermission;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       // Exibir as mensagens para o nosso usuário
       System.out.println("Digite seu nome:");
       String nomeCliente = scanner.next();

       System.out.println("Por favor, digite o número da Agência:");
       String agencia = scanner.next();

       System.out.println("Por favor, digite o número da Conta:");
       int numero = scanner.nextInt();

       System.out.println("Por favor, digite o número da Saldo:");
       Double saldo = scanner.nextDouble();

       // Exibir a mensagem criada

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
