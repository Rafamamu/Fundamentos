package nivel1;

import java.util.Scanner;

public class ConversorDeTemperatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double celsius = 0;
        int opcao = 0;


        do {

            System.out.println("");
            System.out.println("-----------Conversor de Temperatura--------------");
            System.out.println("");


            System.out.print("Digite a temperatura para a conversão em (Celsius): ");
            celsius = scanner.nextDouble();

            System.out.print("Escolha para qual escala converter: ");
            System.out.println("");
            System.out.println("1- Fahrenheit\n 2- Kelvin\n 3- Sair");
            opcao = scanner.nextInt();


            switch (opcao) {

                case 1:
                    double fahrenheit = celsius * 9.0 / 5.0 + 32;

                    System.out.printf("Fahrenheit: %.2f%n ", fahrenheit);
                    break;

                case 2:
                    double kelvin = celsius + 273.15;

                    System.out.printf("Kelvin:  %.2f%n", kelvin);
                    break;

                case 3:
                    System.out.printf("Saindo...");
                    break;

                default:
                    System.out.println("Esse valor não é válido!");



            }

        } while (opcao != 3);



        scanner.close();


    }




}

