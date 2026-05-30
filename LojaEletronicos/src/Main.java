import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Produto");
            System.out.println("3 - Listar Clientes");
            System.out.println("4 - Listar Produtos");
            System.out.println("5 - Adicionar Produtos ao Carrinho");
            System.out.println("6 - Visualizar Carrinho");
            System.out.println("7 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();

                    clientes.add(new Cliente(nome, cpf, telefone));

                    System.out.println("Cliente cadastrado!");
                    break;

                case 2:

                    System.out.println("\n1 - Smartphone");
                    System.out.println("2 - Laptop");
                    System.out.println("3 - TV");
                    System.out.print("Tipo: ");

                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();

                    System.out.print("Preço: ");
                    float preco = sc.nextFloat();
                    sc.nextLine();

                    switch (tipo) {

                        case 1:

                            System.out.print("Memória: ");
                            int memoria = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Cor: ");
                            String cor = sc.nextLine();

                            produtos.add(new Smartphone(marca, modelo, preco, memoria, cor));

                            break;

                        case 2:

                            System.out.print("Sistema Operacional: ");
                            String so = sc.nextLine();

                            System.out.print("Processador: ");
                            String processador = sc.nextLine();

                            produtos.add(new Laptop(marca, modelo, preco, so, processador));

                            break;

                        case 3:

                            System.out.print("Tamanho da Tela: ");
                            int tamanhoTela = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Resolução: ");
                            String resolucao = sc.nextLine();

                            produtos.add(new TV(marca, modelo, preco, tamanhoTela, resolucao));

                            break;

                        default:
                            System.out.println("Tipo inválido!");
                    }

                    System.out.println("Produto cadastrado!");
                    break;

                case 3:

                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        for (int i = 0; i < clientes.size(); i++) {
                            System.out.println(i + " - " + clientes.get(i));
                        }
                    }

                    break;

                case 4:

                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.println(i + " - " + produtos.get(i));
                        }
                    }

                    break;

                case 5:

                    if (clientes.isEmpty()) {
                        System.out.println("Cadastre um cliente primeiro!");
                        break;
                    }

                    if (produtos.isEmpty()) {
                        System.out.println("Cadastre um produto primeiro!");
                        break;
                    }

                    System.out.println("\nClientes:");

                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println(i + " - " + clientes.get(i).getNome());
                    }

                    System.out.print("Escolha o cliente (Por id): ");
                    int indiceCliente = sc.nextInt();

                    Cliente clienteSelecionado = clientes.get(indiceCliente);

                    while (true) {

                        System.out.println("\nProdutos:");

                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.println(i + " - " + produtos.get(i));
                        }

                        System.out.print("Escolha o produto (-1 para finalizar): ");
                        int indiceProduto = sc.nextInt();

                        if (indiceProduto == -1) {
                            break;
                        }

                        System.out.print("Quantidade: ");
                        int quantidade = sc.nextInt();

                        clienteSelecionado.getCarrinho().adicionarProduto(
                                produtos.get(indiceProduto),
                                quantidade
                        );

                        System.out.println("Produto adicionado!");
                    }

                    break;

                case 6:

                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado!");
                        break;
                    }

                    System.out.println("\nClientes:");

                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println(i + " - " + clientes.get(i).getNome());
                    }

                    System.out.print("Escolha o cliente: ");
                    int indice = sc.nextInt();

                    Cliente clienteEscolhido = clientes.get(indice);

                    System.out.println(clienteEscolhido.getCarrinho());

                    break;

                case 7:

                    System.out.println("Encerrando...");
                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 7);

        sc.close();
    }
}