// ProdutoRepository.java (Singleton)
import java.util.*;

public class ProdutoRepository {
    private static ProdutoRepository instancia;
    private List<Produto> produtos = new ArrayList<>();

    private ProdutoRepository() {}

    public static ProdutoRepository getInstancia() {
        if (instancia == null) {
            instancia = new ProdutoRepository();
        }
        return instancia;
    }

    public void adicionar(Produto p) {
        produtos.add(p);
    }

    public Produto buscar(int id) {
        return produtos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void remover(int id) {
        produtos.removeIf(p -> p.getId() == id);
    }

    public List<Produto> listar() {
        return produtos;
    }
}
