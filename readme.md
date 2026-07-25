# Fundamentos de Java: Programação Orientada a Objetos 

> **Aviso:** Este projeto foi criado exclusivamente para fins de estudo, prática e documentação de aprendizado.

## Sobre o Projeto

Este repositório faz parte de um roadmap pessoal de nivelamento e aprofundamento técnico em Java. Após experiências práticas aceleradas no desenvolvimento de sistemas full-stack sob demanda e participações em hackathons e desafios de inovação, o objetivo deste repositório é dar um passo atrás para consolidar os alicerces da linguagem. 

Dominar perfeitamente a Orientação a Objetos é a etapa preparatória para compreender a fundo a arquitetura, a injeção de dependências e os bastidores de frameworks robustos como o Spring Boot.

## O Que Foi Estudado

Os exercícios contidos aqui simulam regras de negócio reais para fixar conceitos essenciais de POO:

*   **Herança e Polimorfismo:** Reutilização de código, uso da palavra-chave `super` e mudança de comportamento de objetos em tempo de execução.
*   **Classes Abstratas e Interfaces:** Criação de contratos estruturais, herança múltipla de tipos e segregação de responsabilidades.
*   **Generics (`<E>`):** Garantia de segurança de tipos em tempo de compilação durante a manipulação de coleções.
*   **Sobrescrita da Classe `Object`:** Implementação customizada de `toString()` e regras de igualdade com `equals()`.
*   **Operadores de Tipo:** Uso do `instanceof` para filtragem de objetos em memória.
*   **Introdução a Design Patterns:** Aplicação do padrão *Strategy* para processamento de pagamentos.

---

## Lista de Exercícios Resolvidos

O projeto está dividido em três blocos de complexidade progressiva:

### Bloco 1: Herança, Superclasses e Classes Abstratas 
1. **Herança e uso do `super`:** Criação da classe base `Funcionario` e subclasses `Desenvolvedor` e `Gerente`, aplicando bônus salariais específicos.
2. **Classes Abstratas:** Transformação de `Funcionario` em classe abstrata com implementação obrigatória do método `obterCargo()`.
3. **Polimorfismo e ArrayLists:** Construção de uma `FolhaDePagamento` que itera sobre uma lista polimórfica de funcionários para calcular o custo total da folha da empresa.

### Bloco 2: Interfaces e Contratos
4. **Criando Interfaces:** Implementação da interface `Autenticavel` para gerentes e clientes, separando o contrato de autenticação da hierarquia de funcionários.
5. **Coleções de Interfaces (Desacoplamento):** Simulação de um sistema de login que itera sobre uma lista de objetos `Autenticavel` de origens diferentes.
6. **Herança Múltipla de Tipos:** Criação das interfaces `Imprimivel` e `Salvavel`, implementadas conjuntamente em uma classe `RelatorioFinanceiro` usando Generics.

### Bloco 3: Operações Avançadas com Coleções e POO
7. **Filtragem com `instanceof`:** Iteração na folha de pagamento para disparar avisos exclusivos apenas para instâncias da classe `Desenvolvedor`.
8. **Padrão Strategy com Interfaces:** Criação da interface `MetodoPagamento` e suas estratégias concretas (`PagamentoPix`, `PagamentoCartao`, `PagamentoBoleto`) processadas dinamicamente em um laço.
9. **Sobrescrita de `toString` e `equals`:** Customização da exibição em tela dos dados do `Desenvolvedor` e alteração da regra de igualdade para comparar instâncias baseadas estritamente no nome.
10. **Desafio Final (Carrinho de Compras Polimórfico):** Criação de um carrinho contendo uma classe abstrata `Produto` e a interface `Tributavel`. A lógica calcula impostos adicionais de 15% apenas para produtos Eletrônicos, isentando os Livros, e exibe o balanço financeiro final.