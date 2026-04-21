# QA Challenge - Testes Automatizados

Projeto realizado para o desafio Agibank

---

## Tecnologias utilizadas

* Java
* Selenium WebDriver
* JUnit 5
* WebDriverManager
* Maven
* RestAssured

---

## Objetivo

Automatizar cenários de busca no site:

https://blog.agibank.com.br/

E validar endpoints de API utilizando testes automatizados.

---

## Cenários implementados

### Front-end (UI)

* Busca com resultados
* Busca sem resultados

### API

* Listar raças (GET /breeds/list/all)
* Buscar imagens por raça (GET /breed/{breed}/images)
* Buscar imagem aleatória (GET /breeds/image/random)
* Validação de erro para raça inválida

---

## Configuração do ambiente

1. Instalar o Java 17
2. Instalar o Maven
3. Clonar o repositório:

```bash
git clone https://github.com/seu-usuario/qa-challenge.git
```

4. Abrir o projeto no IntelliJ

5. Aguardar o Maven baixar as dependências automaticamente

---

## Como executar os testes

### Executar todos os testes

* Clique com botão direito na classe desejada (ex: DogApiTest ou BuscaSemResultadoTest)
* Selecione **Run**

### Executar via Maven (opcional)

```bash
mvn test
```

---

## Relatório de execução

Os resultados dos testes são exibidos no console do IntelliJ ou terminal, contendo:

* Testes executados
* Testes aprovados
* Testes com buscando coisas que não existem
* Detalhes de erro

---

## Observações

* O projeto segue o padrão Page Object Model para testes de UI
* Para API, foi utilizado RestAssured
* Inclui cenários positivos e negativos para maior cobertura
