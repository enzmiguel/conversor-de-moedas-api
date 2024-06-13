public class Main {
    public static void main(String[] args) {

        // Instancia o conversor de moedas que por sua vez instancia objetos das classes ExchangeRateService e UserInterface
        CurrencyConverter c = new CurrencyConverter();

        // Armazena o valor digitado pelo usuário em x
        int x = c.getCurrencyIn();

        // Executa o código enquanto o usuário não digitar 0 na moeda de entrada (x diferente de 0)
        while (x != 0) {
            CurrencyConverter d = new CurrencyConverter();
            x = d.getCurrencyIn();
        }
    }
}