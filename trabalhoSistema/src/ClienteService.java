// ClienteService.java (Controller, Creator, Low Coupling)
public class ClienteService {
    private ClienteRepository repo = ClienteRepository.getInstancia();

    public void criarCliente(int id, String nome, String email) {
        Cliente c = new Cliente(id, nome, email);
        repo.adicionar(c);
    }

    public void listarClientes() {
        repo.listar().forEach(System.out::println);
    }

    public void atualizarCliente(int id, String novoNome, String novoEmail) {
        Cliente c = repo.buscar(id);
        if (c != null) {
            c.setNome(novoNome);
            c.setEmail(novoEmail);
        }
    }

    public void removerCliente(int id) {
        repo.remover(id);
    }
}
