public class ContaCorrente extends Conta {
    private double chequeEspecial = 1000.00;

    public ContaCorrente(String titular) {
        super(titular);
    }

    public boolean usarChequeEspecial(double valor) {
        if (saldo + chequeEspecial >= valor) {
            saldo -= valor;
            System.out.println("Uso do cheque especial de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Limite do cheque especial ultrapassado.");
            return false;
        }
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Limite do cheque especial: R$" + chequeEspecial);
    }
}