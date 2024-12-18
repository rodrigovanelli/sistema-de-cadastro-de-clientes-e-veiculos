package controle;

// Importando as classes
import modelo.Cliente;
import modelo.Veiculo;

import java.util.Scanner; // importando a classe Scanner do pacote java.util, que faz parte da biblioteca padrão do JAVA
import java.util.ArrayList; // importando a classe ArrayList do pacote java.util, que também faz parte da biblioteca padrão do JAVA

public class Principal {
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Veiculo> veiculos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao; // iniciando variável

        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Veiculo");
            System.out.println("3. Listar Clientes");
            System.out.println("4. Listar Veiculos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt(); // armazenando valor digitado a variável
            scanner.nextLine(); // comsumir a quebra de linha

            switch (opcao) {
                case 1 -> cadastrarCliente(scanner);
                case 2 -> cadastrarVeiculo(scanner);
                case 3 -> listarClientes();
                case 4 -> listarVeiculos();
                case 0 -> System.out.println("Programa Encerrando.");
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void cadastrarCliente(Scanner scanner) {

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(cpf, nome, endereco, telefone, email);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void cadastrarVeiculo(Scanner scanner) {

        System.out.print("Placa: ");
        String placa = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ano: ");
        String ano = scanner.nextLine();

        System.out.print("Fabricante: ");
        String fabricante = scanner.nextLine();

        System.out.print("Cor: ");
        String cor = scanner.nextLine();

        Veiculo veiculo = new Veiculo(placa, modelo, ano, fabricante, cor);
        veiculos.add(veiculo);
        System.out.println("Veículo cadastrado com sucesso!");
    }

    private static void listarClientes() {
        System.out.println("=== Lista de Clientes ===");
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            clientes.forEach(cliente -> System.out.println(cliente.toString()));
        }
    }

    private static void listarVeiculos() {
        System.out.println("=== Lista de Veículos ===");
        if (veiculos.isEmpty()) {
            System.out.println(("Nenum veículo cadastrado."));
        } else {
            veiculos.forEach(veiculo -> System.out.println(veiculo.toString()));
        }
    }
}