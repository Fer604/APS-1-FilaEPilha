public class Pilha {
    private Node topo;

    public void push(Elemento elemento) {

        if (elemento == null) {
            System.out.println("Elemento inválido");
        }

        Node novoNode = new Node(elemento);
        novoNode.proximo = topo;
        topo = novoNode;
    }

    public Elemento remover() {

        if (estaVazia()) {
            System.out.println("A pilha está vazia");
        }

        Elemento elementoRemovido = topo.valor;
        topo = topo.proximo;
        return elementoRemovido;
    }

    public boolean estaVazia() {
        return (topo == null);
    }

    public void mostrarHistorico() {

        if (estaVazia()) {
            System.out.println("Histórico vazio");
            return;
        }

        Node atual = topo;
        int contador = 1;

        while (atual != null) {
            System.out.println("\nSolicitação " + contador + ":");
            System.out.println("ID: " + atual.valor.id);
            System.out.println("Descrição: " + atual.valor.descricao);
            System.out.println("Data/Hora: " + atual.valor.dataHora);
            System.out.println("-----------------");

            atual = atual.proximo;
            contador = contador + 1;
        }
    }
}
