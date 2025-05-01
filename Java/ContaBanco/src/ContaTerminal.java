import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome completo.");
        System.out.print("INSIRA: ");
        String nome = scan.nextLine();

        System.out.println("Por favor, digite o número da conta.");
        System.out.print("INSIRA: ");
        int numero = scan.nextInt();
        String buffer = scan.nextLine();

        System.out.println("Por favor, digite o número da agência.");
        System.out.print("INSIRA: ");
        String agencia = scan.nextLine();

        System.out.println("Por favor, insira seu saldo.");
        System.out.print("INSIRA: ");
        double saldo = scan.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!", nome, agencia, numero, saldo);
    }
}