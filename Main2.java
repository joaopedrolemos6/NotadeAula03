public class Main2 {
    public static void main(String[] args) {
        Tv t = new Tv("TV LED 50", 10, 500.00);
        Celular c = new Celular("iPhone 14", 8, 1200.00);
        registerProduct(t);
        registerProduct(c);
        sellProduct("TV LED 50");
        sellProduct("iPhone 14");
        t.accessarCanais();
        c.ligacao();
    }
    public static void registerProduct(Produto produto) {
        System.out.println("Registered: " + produto.getNome());
    }
    public static void sellProduct(String nome) {
        if (nome.equals("TV LED 50")) {
            Tv t = new Tv("TV LED 50", 10, 500.00);
            if (t.getEstoque() > 0) {
                t.setEstoque(t.getEstoque() - 1);
                System.out.println("Vendido: " + nome);
            } else {
                System.out.println("Fora de estoque: " + nome);
            }
        } else if (nome.equals("iPhone 14")) {
            Celular c = new Celular("iPhone 14", 8, 1200.00);
            if (c.getEstoque() > 0) {
                c.setEstoque(c.getEstoque() - 1);
                System.out.println("Vendido: " + nome);
            } else {
                System.out.println("Fora de estoque: " + nome);
            }
        }
    }
}
