
package ContaBancaria;

import java.util.Scanner;

public class Conta {

    String nomeCliente;
    String agencia;
    int numero;
    double saldo;

    void mensagemConfirmacao() {
        System.out.println(
                "Olá, " + nomeCliente
                        + ", obrigado por criar uma conta em nosso banco! " + "Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$ " + saldo + ", já disponível para saque.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta conta = new Conta();

        System.out.println("Por favor, digite o seu nome!");
        conta.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência!");
        conta.agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta!");
        conta.numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo!");
        conta.saldo = scanner.nextDouble();

        scanner.close();

        conta.mensagemConfirmacao();
    }
}
