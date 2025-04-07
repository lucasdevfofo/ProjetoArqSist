// ProdutoFactory.java (Factory Method)
public class ProdutoFactory {
    public static Produto criarProduto(int id, String nome, double preco) {
        return new Produto(id, nome, preco);
    }
}
