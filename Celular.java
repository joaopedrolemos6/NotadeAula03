public class Celular extends Produto {
    public Celular(String nome, int estoque, double preco) {
        super(nome, estoque, preco);
    }

    public void ligacao() {
        System.out.println("Fazendo uma ligaçao...");
    }
}