# QA Challenge - Testes Automatizados

Projeto desenvolvido para o desafio técnico do Agibank.

---

## Tecnologias utilizadas

- Java 17
- Selenium WebDriver
- JUnit 5
- WebDriverManager
- Maven
- RestAssured
- Apache JMeter

---

## Objetivo

Automatizar cenários de testes no front-end e API, garantindo o correto funcionamento da aplicação, além de validar o comportamento sob carga utilizando testes de performance.

---

## Cenários implementados

### Front-end (UI)

- Busca com resultados
- Busca sem resultados

### API

- Listar raças (GET /breeds/list/all)
- Buscar imagens por raça (GET /breed/{breed}/images)
- Buscar imagem aleatória (GET /breeds/image/random)
- Validação de erro para raça inválida

### Performance

- Teste de carga na aplicação BlazeDemo
- Simulação de múltiplos usuários simultâneos
- Análise de throughput, tempo de resposta e taxa de erro

---

## Configuração do ambiente

1. Instalar o Java 17
2. Instalar o Maven
3. Clonar o repositório:

```bash
git clone https://github.com/RodrigoWittaker/qa-challenge.git