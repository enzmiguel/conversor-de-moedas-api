import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    private double valueIn;
    private int currencyIn;
    private int currencyOut;
    Scanner read = new Scanner(System.in);

    public UserInterface() {
        boolean validInput = false;

        // Obtendo moeda de entrada:
        while (!validInput) {
            System.out.println("\n=====================================");
            System.out.println("Selecione a moeda de entrada (de 1 a 5):\n" +
                    "Para USD, digite 1;\n" +
                    "Para BRL, digite 2;\n" +
                    "Para ARS, digite 3;\n" +
                    "Para EUR, digite 4;\n" +
                    "Para CAD, digite 5;\n" +
                    "Para encerrar, digite 0."
            );
            try { // Verifica se a entrada está correta
                currencyIn = read.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                read.next(); // Limpa a entrada inválida
            }
        }

        if (this.getCurrencyIn() != 0) { // Pede o valor da moeda de entrada caso o usuário não tenha digitado 0 para encerrar o programa
            validInput = false;
            // Obtendo valor de entrada:
            while (!validInput) {
                System.out.println("\nDigite o valor a ser convertido: ");
                try { // Verifica se a entrada está correta
                    this.valueIn = read.nextDouble();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número válido.");
                    read.next(); // Limpa a entrada inválida
                }
            }

            validInput = false;
            // Obtendo a moeda de saída:
            while (!validInput) {
                System.out.println("\nSelecione a moeda de saída (de 1 a 5): ");
                try { // Verifica se a entrada está correta
                    this.currencyOut = read.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                    read.next(); // Limpa a entrada inválida
                }
            }
        }
    }


    // Métodos getters

    public double getValueIn() {
        return valueIn;
    }

    public int getCurrencyOut() {
        return currencyOut;
    }

    public int getCurrencyIn() {
        return currencyIn;
    }
}
