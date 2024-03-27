public class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular) {
        super(titular);
    }

    public double calcularRendimento(double taxaSelic) {
        if (taxaSelic > 8.5) {
            return saldo * 0.005; // 0.5% ao mês
        } else {
            return saldo * (taxaSelic * 0.7 / 12); // 70% da Selic ao mês
        }
    }

    public void exibirDados() {
        super.exibirDados();
    }
}
