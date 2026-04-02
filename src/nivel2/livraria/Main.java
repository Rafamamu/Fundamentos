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
        System.out.print(" LOGIN: ");
        String login = scanner.nextLine();
        System.out.print("SENHA: ");
        String senha = scanner.nextLine();

         if (adm.validacaoLoginSenha(login, senha)) {

             System.out.println("=================================================");
             System.out.println("||                                              ||");
             System.out.println("||  SEJA BEM VINDO RAFAEL BIBLIOTECÁRIO         ||");
             System.out.println("||                                              ||");
             System.out.println("||==============================================||");


         }


        scanner.close();

    }


}
