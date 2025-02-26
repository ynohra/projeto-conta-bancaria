import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite a sua Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua Conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu Saldo Atual:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque");

        scanner.close();
    }
}