# Sistema de Atendimento com Fila e Pilha em Java

Este projeto implementa um **sistema de atendimento** simples em **Java**, utilizando duas estruturas de dados fundamentais:

* **Fila (Queue):** para gerenciar os **clientes aguardando atendimento**.
* **Pilha (Stack):** para armazenar o **histórico de atendimentos realizados**.

O sistema permite:

1. Adicionar clientes à fila.
2. Atender o próximo cliente (remoção da fila e registro na pilha).
3. Visualizar a fila atual.
4. Visualizar o histórico de atendimentos.
5. Encerrar o programa.

---

## Estrutura do Projeto

```
├── Elemento.java
├── Fila.java
├── Pilha.java
├── Node.java
└── Main.java
```

### 1. `Elemento.java`

Classe que representa o **objeto principal do sistema**: pode ser tanto um cliente na fila quanto um registro no histórico.

**Atributos:**

* `id`: Identificador único (ex: `C001` para cliente, `R001` para registro).
* `nome`: Nome do cliente (usado na fila).
* `descricao`: Motivo do atendimento (na fila) ou descrição do atendimento realizado (na pilha).
* `dataHora`: Data e hora do atendimento (usado na pilha).
* `fila` e `pilha`: Flags auxiliares para diferenciar o tipo de elemento.

* IDs iniciados com `"C"` → Cliente na **fila**.
* IDs iniciados com `"R"` → Registro na **pilha (histórico)**.

---

### 2. `Fila.java`

Implementa a **estrutura de fila (FIFO)** usando a classe auxiliar `Node`.

**Principais métodos:**

* `adicionar(Elemento cliente)`: adiciona um novo cliente ao final da fila.
* `atenderProximo()`: remove o cliente da frente da fila e o retorna.
* `mostrarFila()`: percorre e exibe todos os clientes da fila.
* `estaVazia()`: verifica se a fila está vazia.

---

### 3. `Pilha.java`

Implementa a **estrutura de pilha (LIFO)** para armazenar o histórico de atendimentos.

**Principais métodos:**

* `push(Elemento elemento)`: empilha um novo atendimento.
* `remover()`: desempilha o último elemento adicionado.
* `mostrarHistorico()`: exibe todos os registros empilhados (do mais recente ao mais antigo).
* `estaVazia()`: verifica se a pilha está vazia.

---

### 4. `Node.java`

Classe auxiliar usada tanto por `Fila` quanto por `Pilha`.
Cada `Node` contém um objeto `Elemento` e uma referência (`proximo`) para o próximo nó.

---

### 5. `Main.java`

Classe principal com a função `main()`.
Implementa o **menu interativo** do sistema via `Scanner`:

**Menu principal:**

1. **Adicionar cliente à fila**

   * Solicita ID, nome e motivo do atendimento.
2. **Atender próximo cliente**

   * Remove o cliente da fila.
   * Solicita descrição e registra na pilha com data e hora atual.
3. **Mostrar fila atual**

   * Exibe todos os clientes aguardando atendimento.
4. **Mostrar histórico de atendimentos**

   * Exibe todos os registros empilhados.
5. **Sair**

   * Encerra o programa.

---

## Como Executar

1. Compile os arquivos:

   ```bash
   javac *.java
   ```
2. Execute o programa:

   ```bash
   java Main
   ```

---
