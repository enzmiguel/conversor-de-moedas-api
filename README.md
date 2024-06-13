# Conversor de Moedas (Currency Converter)

## Descrição

Este projeto é um conversor de moedas que permite ao usuário converter valores entre diferentes moedas. O programa utiliza uma interface de usuário simples para obter a moeda de entrada, a moeda de saída e o valor a ser convertido, e então realiza a conversão usando taxas de câmbio atualizadas de uma API.

## Funcionalidades

- Conversão entre USD, BRL, ARS, EUR e CAD.
- Obtenção das taxas de câmbio mais recentes de uma API externa.
- Interface de usuário interativa para entrada de dados.

## Estrutura do Projeto

O projeto está organizado em três classes principais:

### 1. `UserInterface`

Responsável pela interação com o usuário, obtendo a moeda de entrada, a moeda de saída e o valor a ser convertido.

### 2. `CurrencyConverter`

Realiza a conversão de moeda usando as taxas de câmbio fornecidas pela `ExchangeRateService` e os dados obtidos pela `UserInterface`.

### 3. `ExchangeRateService`

Obtém as taxas de câmbio mais recentes de uma API externa e as disponibiliza para o `CurrencyConverter`.

### 4. `Main`

Classe principal que inicia o programa e gerencia o loop principal para conversão de moedas.

## Dependências

- Java Development Kit (JDK) 11 ou superior
- Biblioteca GSON para parsing de JSON (Obs: seu arquivo foi diretamente incluso na estrutura do projeto)
- Conexão com a internet para acessar a API de taxas de câmbio

## API Utilizada

Este projeto utiliza a [ExchangeRate-API](https://www.exchangerate-api.com/) para obter as taxas de câmbio mais recentes. É necessário uma chave de API, que pode ser obtida criando uma conta gratuita no site da API.

## Exemplo de Execução (conversão de 50 reais em euros)

```bash
=====================================
Selecione a moeda de entrada (de 1 a 5):
Para USD, digite 1;
Para BRL, digite 2;
Para ARS, digite 3;
Para EUR, digite 4;
Para CAD, digite 5;
Para encerrar, digite 0.
2

Digite o valor a ser convertido:
50

Selecione a moeda de saída (de 1 a 5):
4

Você tem 8.70 euros.

```
