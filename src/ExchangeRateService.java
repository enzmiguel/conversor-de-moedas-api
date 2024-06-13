import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateService {

    private String response;
    private double usd;
    private double brl;
    private double ars;
    private double eur;
    private double cad;



    private static final String API_KEY = "4223444829db5bc4788240b9";
    private static final String API_ENDPOINT = "https://v6.exchangerate-api.com/v6/%s/latest/USD";

    // Faz a requisição à API no construtor

    public ExchangeRateService() {
        URI endereco = URI.create(String.format(API_ENDPOINT, API_KEY));
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try { // Caso não haja problema de requisição, solicita resposta e a armazena nas variáveis declaradas na classe.
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            this.response = response.body(); // Guarda apenas o corpo JSON da resposta da API
            this.CurrencyValues(); // Chama o método que armazena os valores das moedas conforme suas chaves na resposta obtida em JSON
        } catch (InterruptedException | IOException e) {
            System.out.println("Ocorreu um erro ao fazer a requisição HTTP.\n" + e.getMessage());
            throw new RuntimeException("Problema de requisição.");
        }
    }

    // Método que armazena os valores das moedas conforme suas chaves na resposta obtida em String
    public void CurrencyValues() {
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(response, JsonObject.class); // Converte a resposta de String para JSON

        // Considera conversion_rates como um objeto para armazenar os valores de suas chaves
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
        this.usd = conversionRates.get("USD").getAsDouble();
        this.ars = conversionRates.get("ARS").getAsDouble();
        this.brl = conversionRates.get("BRL").getAsDouble();
        this.cad = conversionRates.get("CAD").getAsDouble();
        this.eur = conversionRates.get("EUR").getAsDouble();
    }

    // Métodos getters

    public double getUsd() {
        return usd;
    }

    public double getBrl() {
        return brl;
    }

    public double getArs() {
        return ars;
    }

    public double getEur() {
        return eur;
    }

    public double getCad() {
        return cad;
    }

}