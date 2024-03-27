import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Sistema Bancário!");

        System.out.print("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();

        System.out.print("Selecione o tipo de conta (1 - Conta Corrente, 2 - Conta Poupança): ");
        int tipoConta = scanner.nextInt();

        if (tipoConta == 1) {
            ContaCorrente contaCorrente = new ContaCorrente(titular);
            exibirMenu(contaCorrente);
        } else if (tipoConta == 2) {
            ContaPoupanca contaPoupanca = new ContaPoupanca(titular);
            exibirMenu(contaPoupanca);
        } else {
            System.out.println("Tipo de conta inválido.");
        }
    }

    public static void exibirMenu(Conta conta) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            if (conta instanceof ContaCorrente) {
                System.out.println("3. Usar Cheque Especial");
            } else if (conta instanceof ContaPoupanca) {
                System.out.println("3. Calcular Rendimento");
            }
            System.out.println("4. Exibir Dados da Conta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a depositar: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Digite o valor a sacar: ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    if (conta instanceof ContaCorrente) {
                        ContaCorrente cc = (ContaCorrente) conta;
                        System.out.print("Digite o valor a usar do cheque especial: ");
                        double valorCheque = scanner.nextDouble();
                        cc.usarChequeEspecial(valorCheque);
                    } else if (conta instanceof ContaPoupanca) {
                        ContaPoupanca cp = (ContaPoupanca) conta;
                        System.out.print("Digite a taxa Selic: ");
                        double taxaSelic = scanner.nextDouble();
                        System.out.println("Rendimento: R$" + cp.calcularRendimento(taxaSelic));
                    }
                    break;
                case 4:
                    conta.exibirDados();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }
}