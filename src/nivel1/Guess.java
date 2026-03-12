package nivel1;

import java.util.Random;
import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess = 0;
        int contador = 0;
        int numSecreto = random.nextInt(101);


        do {
            System.out.println("------------Jogo de Adivinhação-------------");
            System.out.println("");
            System.out.println("Você tem 3 tentativas!");
            System.out.print("Escolha um número de 1 à 100: ");
            guess = scanner.nextInt();

            if (guess == numSecreto) {
                System.out.println("Parabéns você acertou!! " + numSecreto);
                break;

            } else {

                if (contador < 2) {
                    System.out.println("Tente novamente! ");

                    if (numSecreto > guess) {
                        System.out.println("Chute mais alto!!");
                    } else {

                        System.out.println("Chute mais baixo");
                    }
                }

                contador += 1;



            }



        } while (contador < 3);

        System.out.println("Fim do jogo Você não acertou " +
                "o número secreto que era: "+numSecreto);




        scanner.close();
    }
}
