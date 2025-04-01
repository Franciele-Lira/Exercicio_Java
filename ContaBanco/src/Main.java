import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Você já é nosso cliente!? Entre pelo aplicativo DigitalLira ou site www.bancodigitalLira.com.br");

        System.out.print("\nSe é cliente novo digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Agora seu cpf: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite um valor do depósito para ativar sua conta: ");
        double depositoInicial = scanner.nextDouble();
        Cliente cliente = new Cliente(nome, depositoInicial);


        int opcao;
        do {
            System.out.println("=== MENU BANCO ====");
            System.out.println("2-CONSULTAR SALDO");
            System.out.println("3- CONSULTAR CHEQUE ESPECIAL");
            System.out.println("4- DEPOSITAR");
            System.out.println("5- SACAR");
            System.out.println("6 - PAGAR BOLETO");
            System.out.println("0 - SAIR");
            System.out.print("ESCOLHA UMA DAS OPÇÕES: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 2:
                    cliente.getConta().consultarSaldo();
                    break;
                case 3:
                    cliente.getConta().consultarChequeEspecial();
                    break;
                case 4:
                    System.out.print("Digite o valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    cliente.getConta().depositar(valorDeposito);
                    break;
                case 5:
                    System.out.print("Digite o valor a sacar: ");
                    double valorSaque = scanner.nextDouble();
                    cliente.getConta().sacar(valorSaque);
                    break;
                case 6:
                    System.out.print("Digite o valor do boleto: ");
                    double valorBoleto = scanner.nextDouble();
                    cliente.getConta().pagarBoleto(valorBoleto);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        scanner.close();
    }
}