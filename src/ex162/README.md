# Sistema de Aluguel de Carros (Car Rental)

Exercício de fixação em Java focado em Orientação a Objetos, construção de camadas (Entities/Services) e regras de negócio.

## 📋 Sobre o Projeto

Este projeto consiste em um sistema para calcular o pagamento total de um aluguel de veículos, considerando o tempo de uso e impostos. O objetivo principal é isolar a lógica de negócio em serviços específicos (`RentalService`, `TaxService`) e manter as entidades (`CarRental`, `Vehicle`) enxutas.

## 💼 Regras de Negócio

Conforme o enunciado do exercício:

1. **Cálculo da Locação:**
    - Locações com duração **menor ou igual a 12 horas** são cobradas por hora.
    - Locações com duração **superior a 12 horas** são cobradas por diária.
    - O cálculo de horas/dias sempre arredonda para cima (ex: 4h10min = 5h).

2. **Cálculo de Imposto (Brasil):**
    - Para pagamentos básicos até **R$ 100.00**: Alíquota de **20%**.
    - Para pagamentos básicos acima de **R$ 100.00**: Alíquota de **15%**.

## 🚀 Tecnologias Utilizadas

* **Java** (JDK 17+)
* **Conceitos:**
    * Associação de Objetos
    * Camada de Serviço (Service Layer)
    * Manipulação de Datas (`LocalDateTime`, `Duration`)

## 📦 Estrutura do Projeto

O código está organizado nos seguintes pacotes:
* `application`: Contém a classe `Program` com o método `main`.
* `model.entities`: Classes de domínio (`CarRental`, `Vehicle`, `Invoice`).
* `model.services`: Lógica de negócio (`RentalService`, `BrazilTaxService`).

## 💻 Exemplo de Uso

```text
Entre com os dados do aluguel
Modelo do carro: Civic
Retirada (dd/MM/yyyy hh:mm): 25/06/2018 10:30
Retorno (dd/MM/yyyy hh:mm): 25/06/2018 14:40
Entre com o preço por hora: 10.00
Entre com o preço por dia: 130.00

FATURA:
Pagamento basico: 50.0
Imposto: 10.0
Pagamento total: 60.0