// FuncionarioRepository.java (Singleton)
import java.util.*;

public class FuncionarioRepository {
    private static FuncionarioRepository instancia;
    private List<Funcionario> funcionarios = new ArrayList<>();

    private FuncionarioRepository() {}

    public static FuncionarioRepository getInstancia() {
        if (instancia == null) {
            instancia = new FuncionarioRepository();
        }
        return instancia;
    }

    public void adicionar(Funcionario f) {
        funcionarios.add(f);
    }

    public Funcionario buscar(int id) {
        return funcionarios.stream().filter(f -> f.getId() == id).findFirst().orElse(null);
    }

    public void remover(int id) {
        funcionarios.removeIf(f -> f.getId() == id);
    }

    public List<Funcionario> listar() {
        return funcionarios;
    }
}
