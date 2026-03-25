import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("=========================");
            System.out.println("--SISTEMA COMERCIAL MDEV--");
            System.out.println("E UM PRAZER TER VOCE CONOSCO");
            System.out.println("==========================");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Cadastrar produto");
            System.out.println("4 - Listar produtos");
            System.out.println("5 - Remover cliente");
            System.out.println("6 - Remover produto");
            System.out.println("7 - Atualizar cliente");
            System.out.println("8 - Atualizar produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {

                case 1:
                    Cliente novoCliente = new Cliente();

                    System.out.print("Nome: ");
                    novoCliente.setNome(leitor.nextLine());

                    System.out.print("Telefone: ");
                    novoCliente.setTelefone(leitor.nextLine());

                    System.out.print("Endereço: ");
                    novoCliente.setEndereco(leitor.nextLine());

                    clientes.add(novoCliente);

                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        System.out.println("\n=== CLIENTES CADASTRADOS ===");
                        for (int i = 0; i < clientes.size(); i++) {
                            Cliente clienteTemporario = clientes.get(i);
                            System.out.println("Cliente Numero: " + i +
                                    " |Nome: " + clienteTemporario.getNome() +
                                    " |Tel: " + clienteTemporario.getTelefone() +
                                    " |Endereco: " + clienteTemporario.getEndereco());
                        }

                    }
                    break;

                case 3:
                    Produto novoProduto = new Produto();

                    System.out.println("Digite o nome do produto: ");
                    novoProduto.setNome(leitor.nextLine());

                    System.out.println("Digite a quantidade no estoque: ");
                    novoProduto.setQuantidade(leitor.nextInt());
                    leitor.nextLine();

                    System.out.println("Digite o preco do seu produto: ");
                    novoProduto.setPreco(leitor.nextDouble());
                    leitor.nextLine();

                    produtos.add(novoProduto);

                    System.out.println("Produto cadastrado com sucesso!");

                    break;

                case 4:
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado");

                    } else {
                        System.out.println("\n=== PRODUTOS CADASTRADOS ===");
                        for (int i = 0; i < produtos.size(); i++) {
                            Produto produtoTemporario = produtos.get(i);
                            System.out.println("Produto numero: " + i +
                                    " |Nome: " + produtoTemporario.getNome() +
                                    " |Quantidade no Estoque: " + produtoTemporario.getQuantidade() +
                                    " |R$ " + produtoTemporario.getPreco());
                        }

                    }
                    break;


                case 5:

                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");

                    } else {
                        System.out.println("\n=== CLIENTES CADASTRADOS ===");
                        for (int i = 0; i < clientes.size(); i++) {
                            Cliente clienteTemporario = clientes.get(i);
                            System.out.println("Cliente Numero: " + i +
                                    " |Nome: " + clienteTemporario.getNome() +
                                    " |Tel: " + clienteTemporario.getTelefone() +
                                    " |Endereco: " + clienteTemporario.getEndereco());
                        }
                        System.out.println("Selecione o número do cliente que deseja remover: ");
                        int escolha = leitor.nextInt();
                        leitor.nextLine();

                        if (escolha >= 0 && escolha < clientes.size()) {
                            clientes.remove(escolha);
                            System.out.println("Cliente removido com sucesso!");
                        } else {
                            System.out.println("Erro: Esse cliente não existe na lista.");
                        }

                    }
                    break;

                case 6:
                    if (produtos.isEmpty()) {

                        System.out.println("Nao existe produtos para remocao");

                    } else {
                        System.out.println("=======PRODUTOS CADASTRADOS=======");
                        for (int i = 0; i < produtos.size(); i++) {
                            Produto produtosParaRemocao = produtos.get(i);
                            System.out.println(" Numero do Produto:  " + i +
                                    " |Nome: " + produtosParaRemocao.getNome() +
                                    " |Quantidade: " + produtosParaRemocao.getQuantidade() +
                                    " |R$: " + produtosParaRemocao.getPreco());
                        }
                        System.out.println("Selecione o numero do produto que deseja remover: ");
                        int numeroRemocao = leitor.nextInt();
                        leitor.nextLine();

                        if (numeroRemocao >= 0 && numeroRemocao < produtos.size()) {
                            produtos.remove(numeroRemocao);
                            System.out.println("Produto removido com sucesso");

                        } else {
                            System.out.println("Erro: Esse produto não existe na lista.");

                        }

                    }
                    break;

                case 7:
                    if (clientes.isEmpty()) {
                        System.out.println("Erro! Nao tem cliente cadastrado!");


                    } else {
                        System.out.println("====CLIENTES CADASTRADOS====");
                        for (int i = 0; i < clientes.size(); i++) {
                            Cliente clienteAlt = clientes.get(i);
                            System.out.println("Cliente Numero: " + i +
                                    "|Nome: " + clienteAlt.getNome() +
                                    "|Telefone: " + clienteAlt.getTelefone() +
                                    "|Endereco: " + clienteAlt.getEndereco());
                        }

                        System.out.println("Selecione o cliente que deseja alterar os dados");
                        int escolha = leitor.nextInt();
                        leitor.nextLine();

                        if (escolha >= 0 && escolha < clientes.size()) {
                            System.out.println("Escolha uma opcao para alterar");
                            System.out.println("1- Alterar nome: ");
                            System.out.println("2- Alterar telefone: ");
                            System.out.println("3- Alterar endereco: ");


                            int dadosAtt = leitor.nextInt();
                            leitor.nextLine();

                            if (dadosAtt == 1) {
                                System.out.println("Digite o novo nome: ");
                                clientes.get(escolha).setNome(leitor.nextLine());

                            } else if (dadosAtt == 2) {
                                System.out.println("Digite o novo telefone: ");
                                clientes.get(escolha).setTelefone(leitor.nextLine());

                            } else if (dadosAtt == 3) {
                                System.out.println("Digite o novo endereco: ");
                                clientes.get(escolha).setEndereco(leitor.nextLine());
                            } else {
                                System.out.println("Opcao Invalida!");

                            }
                        } else {
                            System.out.println("Opcao invalida!");

                        }
                    }
                    break;

                case 8:
                    if (produtos.isEmpty()) {
                        System.out.println("Nao ha produtos cadastrados!");


                    } else {
                        System.out.println("Produtos disponiveis para alteracao");
                        for (int i = 0; i < produtos.size(); i++) {
                            Produto produtoAtt = produtos.get(i);
                            System.out.println("Numero do Produto: " + i +
                                    "| Nome: " + produtoAtt.getNome() +
                                    "| Quantidade: " + produtoAtt.getQuantidade() +
                                    "| Preco: R$" + produtoAtt.getPreco());
                        }

                        System.out.println("Digite o numero do Produto: ");
                        int escolhaProduto = leitor.nextInt();
                        leitor.nextLine();

                        if (escolhaProduto >= 0 && escolhaProduto < produtos.size()) {
                            System.out.println("Voce pode fazer as seguintes alteracoes: ");
                            System.out.println("Opcao 1 - Nome: ");
                            System.out.println("Opcao 2 - Quantidade ");
                            System.out.println("Opcao 3 - Preco ");
                            System.out.println(" ");
                            System.out.println("Escolha uma opcao: ");

                            int opcaoAtt = leitor.nextInt();
                            leitor.nextLine();

                            if (opcaoAtt == 1) {
                                System.out.println("Digite o novo nome para o produto: ");
                                produtos.get(escolhaProduto).setNome(leitor.nextLine());

                            } else if (opcaoAtt == 2) {
                                System.out.println("Digite a nova quantidade do produto: ");
                                produtos.get(escolhaProduto).setQuantidade(leitor.nextInt());
                                leitor.nextLine();

                            } else if (opcaoAtt == 3) {
                                System.out.println("Digite o novo preco do produto: ");
                                produtos.get(escolhaProduto).setPreco(leitor.nextDouble());
                                leitor.nextLine();

                            } else {
                                System.out.println("Opcao invalida!");

                            }
                        } else {
                            System.out.println("Opcao Invalida!");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");

                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        }
        while (opcao != 0);

        leitor.close();
    }
}