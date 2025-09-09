import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite número da sua conta: ");
        int contaUsuario = scanner.nextInt();

        System.out.println("Digite sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Qual seu saldo ?");
        double saldo = scanner.nextDouble();

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.next();

        System.out.println("Olá " + nome +  "obrigado por criar uma conta em nosso banco, sua agência é" + agencia + ", conta" + contaUsuario + "e seu saldo" + saldo + "já está disponível para saque");

        

    }

}