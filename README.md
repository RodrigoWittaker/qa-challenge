# QA Challenge - Testes Automatizados

Projeto realizado para o desafio Agibank

---

## Tecnologias utilizadas

* Java
* Selenium WebDriver
* JUnit 5
* WebDriverManager
* RestAssured
* Maven

---

## Objetivo

Automatizar cenários de busca no site:

https://blog.agibank.com.br/

Validando comportamentos com e sem retorno de resultados, tanto em testes de interface (UI) quanto em testes de API.

---

## Estrutura do Projeto

```plaintext
src/test/java
│
├── base        → configuração base dos testes UI
├── pages       → Page Objects (Selenium)
├── tests       → testes de UI
│
└── api
    ├── base    → configuração base da API
    ├── client  → camada de comunicação (RestAssured)
    └── tests   → testes de API
```

---

## Cenários implementados

### UI - Busca com resultados

* Acessa o site
* Clica na lupa de busca
* Realiza uma busca válida
* Valida que existem resultados

### UI - Busca sem resultados

* Acessa o site
* Clica na lupa de busca
* Realiza uma busca inválida
* Valida que não existem resultados

---

### API - Busca com resultados

* Realiza requisição GET para API de posts
* Valida status code 200
* Valida que existem resultados retornados

### API - Busca sem resultados (comportamento real da API)

* Realiza busca com termo inválido
* Valida status code 200
* Valida estrutura da resposta retornada

---

## Como executar o projeto

### Via IntelliJ

* Clique com o botão direito na classe de teste
* Selecione Run

### Via Maven (terminal)

```bash
mvn clean test
```

---

## Observações

* O projeto segue o padrão Page Object Model (POM) para testes UI
* Os testes de API utilizam RestAssured com separação em camadas (base, client e testes)
* Estrutura pensada para escalabilidade e boas práticas de automação

---

## Autor
## Rodrigo Wittaker
