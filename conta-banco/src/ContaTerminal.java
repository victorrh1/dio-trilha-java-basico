import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        String nome;
        int agencia;
        int conta;
        double saldo = 237.48;

        if (args.length >= 3) {
            // Se sim, usar os argumentos
            nome = args[0];
            agencia = Integer.parseInt(args[1]);
            conta = Integer.parseInt(args[2]);
        } else {
            // Se não, solicitar entrada do usuário

            //Exibir as mensagens para o nosso usuario
            System.out.println("Digite o seu nome: ");
            nome = scanner.nextLine();

            System.out.println("Por favor, digite o número da Agência: ");
            agencia = scanner.nextInt();

            System.out.println("Digite o número da Conta: ");
            conta = scanner.nextInt();

        }

        //Exibir a mensagem conta criada
        System.out.println("Olá, " + nome + ",");
        System.out.println("obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ",");
        System.out.println("conta " + conta + ",");
        System.out.println("e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}