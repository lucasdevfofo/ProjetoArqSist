// FuncionarioBuilder.java (Builder)
public class FuncionarioBuilder {
    private int id;
    private String nome;
    private String cargo;
    private double salario;

    public FuncionarioBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public FuncionarioBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public FuncionarioBuilder setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public FuncionarioBuilder setSalario(double salario) {
        this.salario = salario;
        return this;
    }

    public Funcionario build() {
        return new Funcionario(id, nome, cargo, salario);
    }
}
