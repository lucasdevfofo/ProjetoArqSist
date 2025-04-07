import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProdutoService produtoService = new ProdutoService();
        FuncionarioService funcionarioService = new FuncionarioService();
        ClienteService clienteService = new ClienteService();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Gerenciar Produtos");
            System.out.println("2 - Gerenciar Funcionários");
            System.out.println("3 - Gerenciar Clientes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    menuProduto(produtoService, scanner);
                    break;
                case 2:
                    menuFuncionario(funcionarioService, scanner);
                    break;
                case 3:
                    menuCliente(clienteService, scanner);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void menuProduto(ProdutoService service, Scanner scanner) {
        int op;
        do {
            System.out.println("\n-- Produtos --");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Atualizar Produto");
            System.out.println("4 - Remover Produto");
            System.out.println("0 - Voltar");
            System.out.print("Opção: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    service.criarProduto(id, nome, preco);
                    break;
                case 2:
                    service.listarProdutos();
                    break;
                case 3:
                    System.out.print("ID do Produto: ");
                    int idAtualiza = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo preço: ");
                    double novoPreco = scanner.nextDouble();
                    service.atualizarProduto(idAtualiza, novoNome, novoPreco);
                    break;
                case 4:
                    System.out.print("ID do Produto: ");
                    int idRemove = scanner.nextInt();
                    service.removerProduto(idRemove);
                    break;
            }
        } while (op != 0);
    }

    private static void menuFuncionario(FuncionarioService service, Scanner scanner) {
        int op;
        do {
            System.out.println("\n-- Funcionários --");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Listar Funcionários");
            System.out.println("3 - Atualizar Funcionário");
            System.out.println("4 - Remover Funcionário");
            System.out.println("0 - Voltar");
            System.out.print("Opção: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Salário: ");
                    double salario = scanner.nextDouble();
                    service.criarFuncionario(id, nome, cargo, salario);
                    break;
                case 2:
                    service.listarFuncionarios();
                    break;
                case 3:
                    System.out.print("ID do Funcionário: ");
                    int idAtualiza = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo cargo: ");
                    String novoCargo = scanner.nextLine();
                    System.out.print("Novo salário: ");
                    double novoSalario = scanner.nextDouble();
                    service.atualizarFuncionario(idAtualiza, novoNome, novoCargo, novoSalario);
                    break;
                case 4:
                    System.out.print("ID do Funcionário: ");
                    int idRemove = scanner.nextInt();
                    service.removerFuncionario(idRemove);
                    break;
            }
        } while (op != 0);
    }

    private static void menuCliente(ClienteService service, Scanner scanner) {
        int op;
        do {
            System.out.println("\n-- Clientes --");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Atualizar Cliente");
            System.out.println("4 - Remover Cliente");
            System.out.println("0 - Voltar");
            System.out.print("Opção: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    service.criarCliente(id, nome, email);
                    break;
                case 2:
                    service.listarClientes();
                    break;
                case 3:
                    System.out.print("ID do Cliente: ");
                    int idAtualiza = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo email: ");
                    String novoEmail = scanner.nextLine();
                    service.atualizarCliente(idAtualiza, novoNome, novoEmail);
                    break;
                case 4:
                    System.out.print("ID do Cliente: ");
                    int idRemove = scanner.nextInt();
                    service.removerCliente(idRemove);
                    break;
            }
        } while (op != 0);
    }
}
