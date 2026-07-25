### Sprint 1: Streams API e Lambdas (A "cara" do JavaScript no Java)

**1. Filtro e Mapeamento (`filter` e `map`)**
Crie uma classe `Usuario` (nome, idade, statusAtivo).
**Ação:** Dado o mock, filtre apenas os usuários ativos, extraia apenas os nomes deles e guarde em uma nova `List<String>`. Imprima a lista final.

**2. Ordenação e Limite (`sorted` e `limit`)**
Crie uma classe `Produto` (nome, preco).
**Ação:** Usando a Streams API, ordene a lista de produtos do mais caro para o mais barato e retorne apenas os **Top 3** produtos mais caros.

**3. Agrupamento (`Collectors.groupingBy`)**
Crie uma classe `Funcionario` (nome, departamento, salario).
**Ação:** Agrupe os funcionários por departamento. O resultado deve ser um `Map<String, List<Funcionario>>`. Imprima os departamentos e seus respectivos membros.

**4. Redução (`reduce`)**
Crie uma classe `Pedido` (id, valorTotal).
**Ação:** Use o método `reduce` para somar o `valorTotal` de todos os pedidos da lista e obter o faturamento final da loja.

**5. Verificação de Regras (`anyMatch` e `allMatch`)**
Crie uma classe `Transacao` (id, valor, tipo).
**Ação:** Verifique e imprima duas respostas booleanas:

* Todos os valores da lista são maiores que zero?
* Existe alguma transação suspeita (valor acima de R$ 10.000,00)?

```java
// Mock Sprint 1
List<Usuario> usuarios = List.of(new Usuario("Ana", 25, true), new Usuario("João", 30, false), new Usuario("Carlos", 22, true));
List<Produto> produtos = List.of(new Produto("Notebook", 5000.0), new Produto("Mouse", 150.0), new Produto("Teclado", 300.0), new Produto("Monitor", 1200.0));
List<Funcionario> funcionarios = List.of(new Funcionario("Alice", "TI", 6000.0), new Funcionario("Bob", "Vendas", 4000.0), new Funcionario("Charlie", "TI", 7000.0));
List<Pedido> pedidos = List.of(new Pedido(1, 150.50), new Pedido(2, 300.0), new Pedido(3, 50.0));
List<Transacao> transacoes = List.of(new Transacao(1, 500.0, "PIX"), new Transacao(2, 12000.0, "TED"), new Transacao(3, 150.0, "BOLETO"));

```

---

### Sprint 2: Tratamento Avançado de Exceções (Blindando a API)

**6. Exceção Customizada de Regra de Negócio**
Crie uma classe `SaldoInsuficienteException` que herde de `RuntimeException`.
**Ação:** Crie uma classe `ContaBancaria` com método `sacar(double valor)`. Se o valor for maior que o saldo, lance a sua exceção customizada. Capture-a no `Main` e imprima a mensagem de erro.

**7. O Padrão `ResourceNotFound**`
Crie uma classe `EntidadeNaoEncontradaException`.
**Ação:** Pegue o mock de usuários da Sprint 1. Crie um método que busca um usuário pelo nome usando Streams (`.filter().findFirst()`). Se não achar, use o método `.orElseThrow()` para lançar a sua exceção.

**8. Try-Catch Múltiplo**
**Ação:** Crie um método que recebe uma `String` simulando um ID que veio da web, converte para `Integer` e busca em um array. Trate especificamente `NumberFormatException` (se a string tiver letras) e `IndexOutOfBoundsException` (se o ID for maior que o array), imprimindo mensagens amigáveis para cada caso.

**9. Bloco Finally vs Try-with-resources**
Crie uma classe `ConexaoDummy` que implementa a interface `AutoCloseable`. No construtor, imprima "Conexão aberta". No método `close()`, imprima "Conexão fechada".
**Ação:** Instancie essa classe dentro de um bloco `try-with-resources` (pesquise a sintaxe no Java) para garantir que ela seja fechada automaticamente, simulando uma conexão segura, mesmo que ocorra um erro no meio.

**10. Propagação de Exceções (Arquitetura em Camadas)**
Crie três classes: `Controller`, `Service` e `Repository`.
**Ação:** O `Repository` deve simular uma falha e lançar uma `DatabaseException`. O `Service` não deve tratar o erro, apenas repassá-lo (propagação). O `Controller` (que simula a ponta da API) é quem deve ter o bloco `try-catch` para capturar a exceção e retornar um texto "Erro 500: Erro interno no servidor".

---

### Sprint 3: Design Patterns (Os bastidores do Spring)

**11. Padrão Singleton**
Crie uma classe `ConfiguracaoBancoDados` que guarda uma string de URL.
**Ação:** Aplique o padrão Singleton para garantir que seja **impossível** dar um `new` nessa classe de fora, forçando todos a usarem um método `getInstance()`. Prove que funciona instanciando duas variáveis diferentes e testando se elas são iguais (`==`).

**12. Padrão Factory Method**
Crie uma interface `Notificacao` com método `enviar()`. Crie as implementações `EmailNotificacao` e `SmsNotificacao`.
**Ação:** Crie uma classe `NotificacaoFactory` com um método estático que recebe uma `String` ("EMAIL" ou "SMS") e retorna a classe correta instanciada. Instancie e teste no `Main`.

**13. Padrão Strategy (Avançado)**
Você já fez algo parecido no bloco anterior, mas vamos focar em e-commerce.
**Ação:** Crie uma interface `CalculadoraFrete` e implemente estratégias de cálculo para `FreteSedex`, `FretePac` e `FreteTransportadora`. Crie uma classe `Carrinho` que recebe a estratégia desejada dinamicamente no momento de finalizar a compra e calcula o total.

**14. Padrão Builder**
Crie uma classe `UsuarioPayload` (muito comum em APIs) com atributos: `id`, `nome`, `email`, `cpf`, `telefone`, `dataNascimento`.
**Ação:** Implemente o padrão Builder dentro dessa classe. No `Main`, instancie um payload passando apenas `nome` e `email`, sem precisar lidar com um construtor gigante cheio de parâmetros nulos.

**15. Padrão Observer (Simulando Eventos do Spring)**
Crie uma classe `GerenciadorEventos`. Crie uma interface `OuvinteNovoUsuario` com o método `onUsuarioCriado(String nome)`.
**Ação:** Crie duas classes que implementam a interface: `ServicoBoasVindasEmail` e `ServicoLog`. Cadastre ambas no gerenciador. Quando o gerenciador chamar `dispararEvento("João")`, ambas as classes devem executar suas lógicas automaticamente.

