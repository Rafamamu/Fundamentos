package nivel1.livraria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livraria adm = new Livraria();


        int opcao = 0;

        do {

            System.out.println("-----------Livraria Rafa----------------");
            System.out.println("");
            System.out.println("-------------------------------------------");
            System.out.println("Selecione a opção desejada: ");
            System.out.println("1-Cadastrar livro:\n"+
                    "2-Cadastrar usuário:\n3-Emprestar Livro\n4-Devolver livro: " +
                    "\n5-Listar usuários: \n6-Listar livros:\n7-Sair...  ");

            System.out.println("-----------------------------------------------");
            System.out.print("Escolha uma opção digitando o número referente: ");
             try {
                 opcao = scanner.nextInt();
             } catch (RuntimeException e) {
                 System.out.println("Por favor insira o número do menu!");
                 scanner.nextLine();
            }

             scanner.nextLine();



            switch (opcao) {

                case 1:
                    System.out.print("Nome do livro : ");
                    String nome = scanner.nextLine();
                    System.out.println("");
                    System.out.println("-----------------------------------");
                    System.out.print("Nome do autor: ");
                    String autor = scanner.nextLine();
                    Livro livroCriado = new Livro(nome, autor, Status.DISPONIVEL);
                    adm.cadastrarLivros(livroCriado);
                    break;

                case 2:
                    System.out.print("Digite o nome do usuário: ");
                    String nomeUser = scanner.nextLine();
                    System.out.println("");
                    System.out.println("---------------------------");
                    Usuario novoUsuario = new Usuario(nomeUser);
                    adm.cadastrarUsuario(novoUsuario);
                    System.out.println("Usuário Cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("Lista de livros cadastrados: ");
                    System.out.println("------------------------------");
                    adm.listarLivros();
                    System.out.println("Digite o id do livro: ");
                    int id = scanner.nextInt();
                    Livro livroId = adm.buscarLivroPorId(id);
                    System.out.println("Digite o id do usuário: ");
                    int idUsuario = scanner.nextInt();
                    Usuario usuarioId = adm.buscarUsuarioPorId(idUsuario);
                    adm.emprestarLivro(usuarioId, livroId);
                    break;

                case 4:
                    System.out.print("Digite o ID do livro que quer devolver: ");
                    int devoluçãoLivro = scanner.nextInt();
                    System.out.println("-------------------------------------");
                    System.out.println("Digite o ID do usuário: ");
                    int usuarioDevolucao = scanner.nextInt();

                    Usuario usuarioIdDevolucao = adm.buscarUsuarioPorId(usuarioDevolucao);
                    Livro livroIdDevolucao = adm.buscarLivroPorId(devoluçãoLivro);
                    adm.devolverLivro(usuarioIdDevolucao, livroIdDevolucao);
                    break;

                case 5:
                    System.out.println("Lista de usuário cadastrados: ");
                    adm.listarUsuarios();
                    break;

                case 6:
                    System.out.println("Lista de livros cadastrados: ");
                    adm.listarLivros();
                    break;

                case 7:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Não encontrado, digite um dado válido.");

            }


        } while (opcao != 7);


    }
}
