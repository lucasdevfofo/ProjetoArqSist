// FuncionarioService.java (Controller)
public class FuncionarioService {
    private FuncionarioRepository repo = FuncionarioRepository.getInstancia();

    public void criarFuncionario(int id, String nome, String cargo, double salario) {
        Funcionario f = new FuncionarioBuilder()
                .setId(id)
                .setNome(nome)
                .setCargo(cargo)
                .setSalario(salario)
                .build();
        repo.adicionar(f);
    }

    public void listarFuncionarios() {
        repo.listar().forEach(System.out::println);
    }

    public void atualizarFuncionario(int id, String novoNome, String novoCargo, double novoSalario) {
        Funcionario f = repo.buscar(id);
        if (f != null) {
            f.setNome(novoNome);
            f.setCargo(novoCargo);
            f.setSalario(novoSalario);
        }
    }

    public void removerFuncionario(int id) {
        repo.remover(id);
    }
}

