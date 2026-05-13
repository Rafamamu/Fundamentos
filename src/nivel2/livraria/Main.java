package nivel2.livraria;

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


            System.out.print("|| Digite o número da função desejada:            ||");
            int opcao = 0;
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o nome do usuário: ");
                    String nome = scanner.nextLine();
                    Usuario2 usuario = new Usuario2(nome);
                    adm.cadastrarUsuario(usuario);



            }


        }


        scanner.close();


    }


}
