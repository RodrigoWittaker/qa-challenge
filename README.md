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
* Apache JMeter

---

## Objetivo

Automatizar cenários de busca no site:

https://blog.agibank.com.br/

E validar endpoints de API utilizando testes automatizados.

Também foi desenvolvido teste de performance para validação de carga.

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

### Performance

* Teste de carga na aplicação BlazeDemo
* Simulação de múltiplos usuários
* Validação de tempo de resposta e throughput

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

### Executar testes automatizados (UI e API)

* Clique com botão direito na classe desejada (ex: DogApiTest ou BuscaSemResultadoTest)
* Selecione **Run**

### Executar via Maven (opcional)

```bash
mvn test
```

---

## Como executar teste de performance

1. Baixar e abrir o Apache JMeter
2. Abrir o arquivo:

```plaintext
performance/jmeter/blaze-load-test.jmx
```

3. Clicar em **Start (▶️)**
4. Acompanhar os resultados em:

* Summary Report
* View Results Tree

---

## Relatório de execução

Os resultados dos testes automatizados:

* Testes executados
* Testes aprovados
* Testes com falha
* Detalhes de erro

---

## Resultado do teste de performance

Foi realizado teste de carga utilizando Apache JMeter simulando múltiplos usuários acessando a aplicação.

### Resultados obtidos:

* Throughput: ~30 requisições por segundo
* Tempo médio de resposta: ~373 ms
* Taxa de erro: 0%

### Análise:

O sistema apresentou estabilidade durante o teste, sem falhas ou erros, e com tempos de resposta dentro do aceitável.

Entretanto, não foi possível atingir o requisito de 250 requisições por segundo devido a limitações do ambiente local utilizado para execução dos testes.

Para atingir esse volume de carga, seria necessário utilizar uma infraestrutura mais robusta ou execução distribuída do JMeter.

---

## Observações

* O projeto segue o padrão Page Object Model para testes de UI
* Para API, foi utilizado RestAssured
* Inclui cenários positivos e negativos para maior cobertura
* Teste de performance executado localmente para validação inicial
