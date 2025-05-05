# Contador

#### Autor  
- [Guilherme Flyan](https://github.com/GFlyan)

Neste desafio do módulo de Controle de Fluxo, coloquei em prática os conhecimentos adquiridos ao implementar um sistema simples de contagem baseado em dois parâmetros fornecidos pelo usuário via terminal.

1. Criei o projeto `ControleFluxo`, com a estrutura proposta no enunciado.
2. Dentro do projeto, desenvolvi a classe `Contador.java`, responsável por realizar a leitura dos parâmetros, validar as condições e executar a contagem com base na diferença entre os dois valores inseridos.
3. Também criei a classe `ParametrosInvalidosException`, utilizada para lançar uma exceção personalizada nos casos em que o primeiro número informado seja maior que o segundo, garantindo assim o fluxo correto da lógica de repetição.

###### Pratiquei o uso de estruturas condicionais, laços de repetição e tratamento de exceções.

Durante a execução, o programa solicita dois valores inteiros via terminal. Caso o segundo seja maior que o primeiro, o sistema imprime uma sequência de mensagens numeradas, simulando uma contagem. Por exemplo:

```Usuário insere os números 5 e 9```

O sistema imprime:
```
Imprimindo o número 1.  
Imprimindo o número 2.  
Imprimindo o número 3.  
Imprimindo o número 4.
```

Se o usuário inserir valores inválidos (como o primeiro número maior que o segundo), o programa lança a exceção `ParametrosInvalidosException` com a seguinte mensagem:

**"O segundo parâmetro deve ser maior que o primeiro."**

Esse desafio foi essencial para consolidar o uso da estrutura `try-catch`, criação de exceções personalizadas, e controle de fluxo utilizando as estruturas `if-else` e `for-while`.
