package nivel1;

import java.util.Scanner;

public class Calculator {

    int a;
    int b;

    public Calculator() {
        this.a = a;
        this.b = b;
    }


    public int sum() {
        return a + b;
    }


    public int multiplication() {
        return a * b;
    }

    public int sub() {
        return a - b;
    }

    public int division() {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }
        return a / b;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int operacao = 0;

        int num1 = 0;
        int num2 = 0;

        do {

            Calculator calc = new Calculator();


            System.out.println("");
            System.out.println("/-/-/-/-/-/-/-/-/-/-//-/-/-/-/-//-/-/-/-/-");
            System.out.println("----------Calculadora do Rafa----------------");
            System.out.println("");
            System.out.println("Escolha um número: ");
            num1 = scanner.nextInt();

            System.out.println("Escolha o segundo número: ");
            num2 = scanner.nextInt();
            System.out.println("------------------------------------------");

            calc.a = num1;
            calc.b = num2;

            System.out.println("1- Soma:\n " +
                    "2- Multiplicação:\n 3- subtração:\n 4- divisão:\n 5- sair...");

            System.out.println("Escolha a operação digitando o número: ");


            operacao = scanner.nextInt();


            switch (operacao) {
                case 1:

                    System.out.println("Resultado: " + calc.sum());

                    break;
                case 2:
                    System.out.println("Resultado: " + calc.multiplication());
                    break;
                case 3:
                    System.out.println("Resultado: " + calc.sub());
                    break;
                case 4:
                    try {
                        System.out.println("Resultado: " + calc.division());
                    } catch (ArithmeticException arithmeticException) {
                        System.out.println(arithmeticException.getMessage());
                    }
                    break;

                default:
                    System.out.println("Saindo...");

            }
        } while (operacao != 5);

        scanner.close();

    }
}
