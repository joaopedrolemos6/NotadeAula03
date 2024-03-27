public class Tv extends Produto {
    public Tv(String nome, int estoque, double preco) {
        super(nome, estoque, preco);
    }
    public void accessarCanais() {
        System.out.println("Accessing channels on the TV...");
    }
}