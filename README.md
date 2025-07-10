# 💳 Sistema de Processamento de Transações Financeiras com POO em Java

Este projeto é uma aplicação Java que simula um sistema robusto de processamento de diferentes tipos de transações financeiras (Débito, Crédito, Pix). Ele foi desenvolvido com o propósito de aprofundar e demonstrar a aplicação prática dos conceitos mais importantes da Programação Orientada a Objetos (POO).

## ✨ Conceitos de POO e Boas Práticas Aplicadas

O desenvolvimento deste sistema me proporcionou um entendimento sólido e a aplicação direta dos seguintes pilares da POO e boas práticas de desenvolvimento:

-   **Classes e Objetos:** Representação de entidades do domínio financeiro (Transação, TransacaoDebito, TransacaoCredito, TransacaoPix) como classes e suas instâncias como objetos concretos.
-   **Atributos e Métodos:** Definição clara das propriedades (ex: `valor`, `status`, `numeroCartao`, `chavePix`, `parcelas`) e dos comportamentos (ex: `processar()`, `exibirDetalhes()`, `getStatus()`) de cada tipo de transação.
-   **Construtores:** Inicialização controlada dos objetos, garantindo que cada transação seja criada com um estado válido, incluindo a geração de IDs únicos e registro de data/hora.
-   **Encapsulamento:** Utilização estratégica de modificadores de acesso (`protected` para atributos herdáveis, `private` para específicos) e métodos `getters`/`setters` para proteger os dados internos das transações e controlar como eles são acessados e modificados.
-   **Herança:** Criação de uma hierarquia de classes bem definida. A superclasse **`Transacao` (abstrata)** estabelece o contrato e os comportamentos comuns, enquanto `TransacaoDebito`, `TransacaoCredito` e `TransacaoPix` (subclasses) estendem essa base, adicionando suas particularidades e implementando lógicas específicas.
    -   Uso da palavra-chave `extends` e da chamada `super()` nos construtores das subclasses para inicializar a parte da superclasse.
-   **Classes e Métodos Abstratos:** A classe `Transacao` foi modelada como `abstract`, contendo métodos `abstract` como `processar()` e `exibirDetalhes()`. Isso impõe que cada subclasse concreta forneça sua própria implementação para essas operações cruciais, garantindo a especialização do comportamento.
-   **Sobrescrita de Métodos (`@Override`):** Implementação de lógicas distintas para o processamento (`processar()`) e exibição de detalhes (`exibirDetalhes()`) em cada tipo de transação, adaptando o comportamento herdado às necessidades específicas de Débito, Crédito e Pix.
-   **Polimorfismo:** O principal destaque do projeto. A capacidade de tratar diferentes tipos de transações (objetos de `TransacaoDebito`, `TransacaoCredito`, `TransacaoPix`) de forma unificada através de referências à superclasse `Transacao`. Isso é exemplificado na classe principal ao armazenar todos em uma `List<Transacao>` e ao invocar métodos como `processar()` e `exibirDetalhes()`, onde a implementação correta é chamada dinamicamente em tempo de execução.
-   **Estruturas de Dados Dinâmicas (`List` / `ArrayList`):** Gerenciamento da coleção de transações em uma `ArrayList`, que oferece flexibilidade para adicionar e manipular um número variável de itens de diferentes tipos polimorficamente.
-   **IDs Universalmente Únicos (UUID):** Geração de identificadores únicos para cada transação (`idTransacao`), assegurando a não-colisão e a rastreabilidade em cenários complexos.
-   **Laços de Repetição (`for-each`):** Utilização de uma sintaxe elegante e concisa para iterar sobre a lista de transações, facilitando o processamento e a exibição em lote.
-   **Interação com o Usuário e Validação de Entrada:** Implementação de um menu interativo no console, com tratamento básico para entradas inválidas, melhorando a experiência do usuário.

## 🚀 Como Executar o Projeto

Para compilar e rodar este sistema em sua máquina, siga os passos abaixo:

1.  **Clone o repositório:**
    ```bash
    git clone [LINK_DO_SEU_REPOSITORIO_AQUI]
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd nome-do-seu-repositorio
    ```
3.  **Compile todos os arquivos `.java`:**
    ```bash
    javac Transacao.java TransacaoDebito.java TransacaoCredito.java TransacaoPix.java ProcessadorDePagamentos.java
    ```
    *(Ajuste os nomes dos arquivos `.java` conforme os nomes exatos das suas classes, especialmente a que contém o método `main`.)*
4.  **Execute a classe principal:**
    ```bash
    java ProcessadorDePagamentos # Ou o nome da sua classe principal
    ```

O programa iniciará um menu interativo no console, onde você poderá adicionar, processar e visualizar as transações.

## 📈 Resultados e Aprendizados Chave

Este projeto reforça a importância da modelagem orientada a objetos para criar software modular, flexível e de fácil manutenção. A aplicação prática de herança e polimorfismo em um cenário real de transações financeiras solidificou meu entendimento sobre como Java permite gerenciar objetos diversos de forma unificada e poderosa.

Estou animado(a) para continuar explorando o universo da POO e construir soluções cada vez mais robustas!

---

**Autor:**
[Seu Nome Completo]
[Link para seu LinkedIn (Opcional)]

---
