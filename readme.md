# Java: Programação Orientada a Objetos e Design Patterns

> **Aviso:** Este repositório é exclusivo para estudos, prática e documentação de aprendizado em Java. O foco é a consolidação de conceitos avançados de orientação a objetos, arquitetura e padrões de projeto que compõem a base de frameworks robustos corporativos, como o Spring Boot.

## Sobre o Projeto

O repositório documenta a evolução técnica em Java, focando em estruturação de software, injeção de dependências, inversão de controle e boas práticas. O projeto está estruturado em dois blocos principais que refletem a progressão da complexidade arquitetural.

---

## Estrutura do Repositório

### Bloco 1: Fundamentos de POO e Contratos

Este bloco contém a primeira lista de exercícios, focada nos pilares da Orientação a Objetos, criação de contratos rígidos e polimorfismo.

* **`bloco1/ex1/` (Exercícios 1 ao 9):**
* **Herança e Polimorfismo:** Classes base (`Funcionario`), subclasses (`Desenvolvedor`, `Gerente`) e abstração.
* **Interfaces e Contratos:** Separação de responsabilidades com `Autenticavel`, `Imprimivel` e `Salvavel`.
* **Generics:** Implementações seguras de tipo em tempo de compilação.
* **Padrão Strategy Base:** Interface `MetodoPagamento` com estratégias concretas (`PagamentoPix`, `PagamentoCartao`, `PagamentoBoleto`).
* **Sobrescrita de `Object`:** Customização de `toString()` e `equals()`.


* **`bloco1/ex10/` (Desafio Final do Bloco 1):**
* **Carrinho de Compras Polimórfico:** Sistema de tributação dinâmico utilizando a interface `Tributavel` e a classe abstrata `Produto` (`Eletronico`, `Livro`), processando impostos diferentes por tipo de objeto.

---

### Bloco 2: Recursos Modernos, Tratamento de Erros e Design Patterns

Este bloco consolida a segunda lista de estudos, dividida em três Sprints arquiteturais com foco em recursos modernos do Java e padrões de projeto essenciais.

* **`bloco2/sprint1/` (Streams API e Lambdas):**
* Abordagem funcional no Java (similar ao ecossistema JavaScript).
* Operações de filtragem e transformação (`filter`, `map`).
* Ordenação e limitação de coleções (`sorted`, `limit`).
* Agrupamento de dados complexos (`Collectors.groupingBy`).
* Redução e validações booleanas em massa (`reduce`, `anyMatch`, `allMatch`).
* *Classes envolvidas:* `Usuario`, `Produto`, `Funcionario`, `Pedido`, `Transacao` e seus respectivos *Services*.


* **`bloco2/sprint2/` (Tratamento Avançado de Exceções):**
* Criação de exceções customizadas para regras de negócio (`SaldoInsuficienteException`, `EntidadeNaoEncontradaException`).
* Padrão *Resource Not Found* integrado à Streams API com `.orElseThrow()`.
* Gerenciamento autônomo de memória com `try-with-resources` e a interface `AutoCloseable` (`ConexaoDummy`).
* Propagação de exceções simulando arquitetura em camadas (`Controller`, `Service`, `Repository`).


* **`bloco2/sprint3/` (Design Patterns Corporativos):**
* **Singleton (`ConfiguracaoBancoDados`):** Controle estrito de instância na memória (Thread-safe).
* **Factory Method (`NotificacaoFactory`):** Criação dinâmica e terceirizada de instâncias baseadas em parâmetros externos.
* **Strategy Avançado (`Carrinho`, `CalculadoraFrete`):** Eliminação de blocos condicionais através da injeção dinâmica de estratégias de frete em tempo de execução.
* **Builder (`UsuarioPayload`, `UsuarioBuilder`):** Construção de objetos complexos e payloads de APIs via encadeamento de métodos (Method Chaining), evitando construtores verbosos.
* **Observer (`GerenciadorEventos`, `OuvinteNovoUsuario`):** Implementação do padrão Publisher/Subscriber para processamento assíncrono de eventos, simulando o comportamento nativo de *listeners* do Spring Framework.