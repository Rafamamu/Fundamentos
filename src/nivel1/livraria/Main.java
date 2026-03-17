package nivel1.livraria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        Livraria adm = new Livraria();



        int opcao = 0;

        do {

            System.out.println("-----------Livraria Rafa----------------");
            System.out.println("");
            System.out.println("-------------------------------------------");
            System.out.println("Selecione a opção desejada: ");
            System.out.println("1- Cadastrar livro:\n " +
                    "2- Cadastrar usuário:\n3- Emprestar Livro\n 4-Devolver livro: " +
                    "\n 5- Listar usuários: \n 6- Listar livros:\n 7- Sair...  ");

            System.out.println("-----------------------------------------------");
            System.out.print("Escolha uma opção digitando o número referente: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome do livro : ");
                    String nome = scanner.nextLine();
                    System.out.println("-----------------------------------");
                    System.out.println("Nome do autor: ");
                    String autor = scanner.nextLine();
                    Livro livro = new Livro(nome,autor, Status.DISPONIVEL);
                    adm.cadastrarLivros(livro);
                    break;

                case 2:
                    System.out.print("Digite o nome do usuário: ");
                    String nomeUser = scanner.nextLine();
                    System.out.println("---------------------------");
                    Usuario usuario = new Usuario(nomeUser);
                    adm.cadastrarUsuario(usuario);
                    System.out.println("Usuário Cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("Lista de livros cadastrados: ");
                    System.out.println("------------------------------");
                    adm.listarLivros();
                    System.out.println("Digite o id do livro: ");
                    int  id = scanner.nextInt();
                    adm.buscarLivroPorId(id);
                    Livro livro1 = new Livro(livro.getNome(), livro.getAutor(), livro.getStatus());
                    System.out.println("Digite o id do usuário: ");
                    int idUsuario = scanner.nextInt();





            }


        }while (opcao != 7);




    }
}
