// ClienteRepository.java (Singleton)
import java.util.*;

public class ClienteRepository {
    private static ClienteRepository instancia;
    private List<Cliente> clientes = new ArrayList<>();

    private ClienteRepository() {}

    public static ClienteRepository getInstancia() {
        if (instancia == null) {
            instancia = new ClienteRepository();
        }
        return instancia;
    }

    public void adicionar(Cliente c) {
        clientes.add(c);
    }

    public Cliente buscar(int id) {
        return clientes.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    public void remover(int id) {
        clientes.removeIf(c -> c.getId() == id);
    }

    public List<Cliente> listar() {
        return clientes;
    }
}
