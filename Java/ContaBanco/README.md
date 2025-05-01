
# DIO - Trilha Java Básico

#### Autor  
- [Guilherme Flyan](https://github.com/GFlyan)

## Sintaxe - Desafio

Neste desafio do módulo de Sintaxe, coloquei em prática todo o conteúdo estudado desenvolvendo o seguinte cenário:

1. Criei o projeto `ContaBanco`, que recebe dados via terminal com as características de uma conta bancária, conforme os atributos abaixo.
2. Dentro do projeto, desenvolvi a classe `ContaTerminal.java`, responsável por toda a codificação do programa.

###### Revisei as regras de declaração de variáveis

| Atributo      | Tipo     | Exemplo   
|---------------|----------|---------
| Número        | Inteiro  | 1021 
| Agência       | Texto    | 067-8
| Nome do Cliente | Texto    | MARIO ANDRADE
| Saldo         | Decimal  | 237.48

###### Também revisei o uso do terminal, o método main e a classe Scanner

Implementei a funcionalidade para que os dados fossem inseridos via terminal. A cada campo, o usuário recebe uma mensagem indicando o que deve ser preenchido. Exemplo:

* Programa: "Por favor, digite o número da Agência!"
* Usuário: 1021 *(e pressiona ENTER para o próximo campo)*

Após a inserção de todas as informações, o sistema exibe a seguinte mensagem formatada:

*"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agência], conta [Número] e seu saldo [Saldo] já está disponível para saque".*

Os campos entre colchetes são substituídos pelos dados fornecidos pelo usuário durante a execução do programa.
