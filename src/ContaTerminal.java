import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("🏦 - Progama de Conta Bancária\n");

    System.out.println("Digite o nº da Conta:");
    int account_number = scanner.nextInt();

    System.out.println("Digite o nº da Agencia:");
    String agency_number = scanner.next();

    System.out.println("Digite o seu nome:");
    String costumer_name = scanner.next();

    System.out.println("Digite o seu saldo:");
    double balance = scanner.nextDouble();

    scanner.close();

    String message = String.format(
        "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque",
        costumer_name, agency_number, account_number, balance);

    System.out.println(message);
  }

}
