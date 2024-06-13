public class CurrencyConverter {
    private ExchangeRateService rates = new ExchangeRateService();
    private UserInterface uif = new UserInterface();


    private double usdValue = rates.getUsd();
    private double brlValue = rates.getBrl();
    private double arsValue = rates.getArs();
    private double eurValue = rates.getEur();
    private double cadValue = rates.getCad();

    private int currencyIn = uif.getCurrencyIn();
    private double valueIn = uif.getValueIn();
    private int currencyOut = uif.getCurrencyOut();
    private double valueOut;

    public CurrencyConverter() {

        switch (currencyIn) { // A conversão acontece no construtor da classe CurrencyConverter
            case 1: // Caso a moeda de entrada seja 1...
                switch (currencyOut) {
                    case 1: // ... e a moeda de saída seja 1:
                        valueOut = valueIn; // Calcula a conversão para cada combinação possível
                        System.out.printf("\nVocê tem %.2f dólares estadunidenses.%n", valueOut);
                        break;
                    case 2: // ... e a moeda de saída seja 2:
                        valueOut = valueIn * brlValue;
                        System.out.printf("\nVocê tem %.2f reais.%n", valueOut);
                        break;
                    case 3: // ... e a moeda de saída seja 3:
                        valueOut = valueIn * arsValue;
                        System.out.printf("\nVocê tem %.2f pesos argentinos.%n", valueOut);
                        break;
                    case 4: // ... e a moeda de saída seja 4:
                        valueOut = valueIn * eurValue;
                        System.out.printf("\nVocê tem %.2f euros.%n", valueOut);
                        break;
                    case 5: // ... e a moeda de saída seja 5:
                        valueOut = valueIn * cadValue;
                        System.out.printf("\nVocê tem %.2f dólares canadenses.%n", valueOut);
                        break;
                }
                break;
            case 2: // Caso a moeda de entrada seja 2...
                switch (currencyOut) {
                    case 1: // ... e a moeda de saída seja 1:
                        valueIn = valueIn / brlValue; // Calcula a conversão para cada combinação possível
                        valueOut = valueIn * usdValue;
                        System.out.printf("\nVocê tem %.2f dólares estadunidenses.%n", valueOut);
                        break;
                    case 2: // ... e a moeda de saída seja 2:
                        valueOut = valueIn;
                        System.out.printf("\nVocê tem %.2f reais.%n", valueOut);
                        break;
                    case 3: // ... e a moeda de saída seja 3:
                        valueIn = valueIn / brlValue;
                        valueOut = valueIn * arsValue;
                        System.out.printf("\nVocê tem %.2f pesos argentinos.%n", valueOut);
                        break;
                    case 4: // ... e a moeda de saída seja 4:
                        valueIn = valueIn / brlValue;
                        valueOut = valueIn * eurValue;
                        System.out.printf("\nVocê tem %.2f euros.%n", valueOut);
                        break;
                    case 5: // ... e a moeda de saída seja 5:
                        valueIn = valueIn / brlValue;
                        valueOut = valueIn * cadValue;
                        System.out.printf("\nVocê tem %.2f dólares canadenses.%n", valueOut);
                        break;
                }
                break;
            case 3: // Caso a moeda de entrada seja 1...
                switch (currencyOut) {
                    case 1: // ... e a moeda de saída seja 1:
                        valueIn = valueIn / arsValue; // Calcula a conversão para cada combinação possível
                        valueOut = valueIn * usdValue;
                        System.out.printf("\nVocê tem %.2f dólares estadunidenses.%n", valueOut);
                        break;
                    case 2: // ... e a moeda de saída seja 2:
                        valueIn = valueIn / arsValue;
                        valueOut = valueIn * brlValue;
                        System.out.printf("\nVocê tem %.2f reais.%n", valueOut);
                        break;
                    case 3: // ... e a moeda de saída seja 3:
                        valueOut = valueIn;
                        System.out.printf("\nVocê tem %.2f pesos argentinos.%n", valueOut);
                        break;
                    case 4: // ... e a moeda de saída seja 4:
                        valueIn = valueIn / arsValue;
                        valueOut = valueIn * eurValue;
                        System.out.printf("\nVocê tem %.2f euros.%n", valueOut);
                        break;
                    case 5: // ... e a moeda de saída seja 5:
                        valueIn = valueIn / arsValue;
                        valueOut = valueIn * cadValue;
                        System.out.printf("\nVocê tem %.2f dólares canadenses.%n", valueOut);
                }
                break;
            case 4: // Caso a moeda de entrada seja 1...
                switch (currencyOut) {
                    case 1: // ... e a moeda de saída seja 1:
                        valueIn = valueIn / eurValue; // Calcula a conversão para cada combinação possível
                        valueOut = valueIn * usdValue;
                        System.out.printf("\nVocê tem %.2f dólares estadunidenses.%n", valueOut);
                        break;
                    case 2: // ... e a moeda de saída seja 2:
                        valueIn = valueIn / eurValue;
                        valueOut = valueIn * brlValue;
                        System.out.printf("\nVocê tem %.2f reais.%n", valueOut);
                        break;
                    case 3: // ... e a moeda de saída seja 3:
                        valueIn = valueIn / eurValue;
                        valueOut = valueIn * arsValue;
                        System.out.printf("\nVocê tem %.2f pesos argentinos.%n", valueOut);
                        break;
                    case 4: // ... e a moeda de saída seja 4:
                        valueOut = valueIn;
                        System.out.printf("\nVocê tem %.2f euros.%n", valueOut);
                        break;
                    case 5: // ... e a moeda de saída seja 5:
                        valueIn = valueIn / eurValue;
                        valueOut = valueIn * cadValue;
                        System.out.printf("\nVocê tem %.2f dólares canadenses.%n", valueOut);
                        break;
                }
                break;
            case 5: // Caso a moeda de entrada seja 1...
                switch (currencyOut) {
                    case 1: // ... e a moeda de saída seja 1:
                        valueIn = valueIn / cadValue; // Calcula a conversão para cada combinação possível
                        valueOut = valueIn * usdValue;
                        System.out.printf("\nVocê tem %.2f dólares estadunidenses.%n", valueOut);
                        break;
                    case 2: // ... e a moeda de saída seja 2:
                        valueIn = valueIn / cadValue;
                        valueOut = valueIn * brlValue;
                        System.out.printf("\nVocê tem %.2f reais.%n", valueOut);
                        break;
                    case 3: // ... e a moeda de saída seja 3:
                        valueIn = valueIn / cadValue;
                        valueOut = valueIn * arsValue;
                        System.out.printf("\nVocê tem %.2f pesos argentinos.%n", valueOut);
                        break;
                    case 4: // ... e a moeda de saída seja 4:
                        valueIn = valueIn / eurValue;
                        valueOut = valueIn * cadValue;
                        System.out.printf("\nVocê tem %.2f euros.%n", valueOut);
                        break;
                    case 5: // ... e a moeda de saída seja 5:
                        valueOut = valueIn;
                        System.out.printf("\nVocê tem %.2f dólares canadenses.%n", valueOut);
                        break;
                }
        }

    }

    // Método getter

    public int getCurrencyIn() {
        return currencyIn;
    }
}
