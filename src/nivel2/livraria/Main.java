package nivel2.livraria;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =
                new Scanner(System.in);
        AdmLivraria2 adm =
                new AdmLivraria2("rafaroga46@gmail.com", "rafa0806");


        System.out.println("====================================================");
        System.out.println("||                                                ||");
        System.out.println("||          LIVRARIA SYSTEM                       ||");
        System.out.println("||                                                ||");
        System.out.println("====================================================");
        System.out.print("LOGIN: ");
        String login = scanner.nextLine();
        System.out.print("SENHA: ");
        String senha = scanner.nextLine();


        while (!adm.validacaoLoginSenha(login, senha)) {

            System.out.println("Login ou senha incorretos, digite novamente: ");
            System.out.println("=============================================");

            System.out.print("LOGIN: ");
            login = scanner.nextLine();
            System.out.print("SENHA: ");
            senha = scanner.nextLine();
        }


        boolean rodando = true;

        while (rodando) {
            System.out.println("=================================================");
            System.out.println("||                                              ||");
            System.out.println("||  SEJA BEM VINDO RAFAEL BIBLIOTECÁRIO         ||");
            System.out.println("||                                              ||");
            System.out.println("||==============================================||");
            System.out.println("|| Escolha uma opção:                           ||");
            System.out.println("||==============================================||");
            System.out.println("|| 1-Cadastrar novo usuário                     ||" +
                    "\n|| 2-Cadastrar livro                            ||" +
                    "\n|| 3-Listar usuários                            ||" +
                    "\n|| 4-Listar livros                              ||" +
                    "\n|| 5-Sair...                                    ||");


            System.out.println("|| Opção:                                       ||");
            int opcao = 0;
            opcao = scanner.nextInt();
            System.out.println(">>");
            System.out.println("||==============================================||");

            scanner.nextLine();

            switch (opcao) {

                case 1: {
                    System.out.print("Digite o nome do usuário: ");
                    String nome = scanner.nextLine();
                    Usuario2 usuario = new Usuario2(nome);
                    adm.cadastrarUsuario(usuario);
                    break;

                }

                case 2: {
                    System.out.print("||  Digite o nome do livro para o cadastro: ");
                    String nomeLivro = scanner.nextLine();
                    System.out.println(" ");
                    System.out.println("||========================================||");
                    System.out.print("|| Digite o preço para o cadastro:  ");
                    double precoLivro = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("||========================================||");
                    System.out.print("|| Nome do autor: ");
                    String nomeAutor = scanner.nextLine();

                    Livro2 livro = new Livro2(nomeLivro, precoLivro, nomeAutor);

                    adm.cadastrarLivro(livro);
                    break;

                }

                case 3: {
                    System.out.println("Usuários cadastrados: ");
                    for (Usuario2 usuario : adm.listarUsuarios()) {

                        System.out.println(usuario);

                    }
                    break;

                }

                case 4: {
                    System.out.println("Livros cadastrados: ");
                    for (Livro2 livroCadastrado : adm.listarLivros()) {
                        System.out.println(livroCadastrado);
                    }

                    break;
                }

                case 5: {
                    rodando = false;

                    break;
                }


            }


        }


        scanner.close();


    }


}
