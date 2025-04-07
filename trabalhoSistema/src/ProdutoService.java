// ProdutoService.java (Controller, Creator)
public class ProdutoService {
    private ProdutoRepository repo = ProdutoRepository.getInstancia();

    public void criarProduto(int id, String nome, double preco) {
        Produto p = ProdutoFactory.criarProduto(id, nome, preco);
        repo.adicionar(p);
    }

    public void listarProdutos() {
        repo.listar().forEach(System.out::println);
    }

    public void atualizarProduto(int id, String novoNome, double novoPreco) {
        Produto p = repo.buscar(id);
        if (p != null) {
            p.setNome(novoNome);
            p.setPreco(novoPreco);
        }
    }

    public void removerProduto(int id) {
        repo.remover(id);
    }
}
