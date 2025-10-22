public class Fila {
    private Node frente;
    private Node tras;

    public Fila() {
        this.frente = null;
        this.tras = null;
    }
    
    public void adicionar(Elemento cliente) {
        if (cliente == null) {
            System.out.println("Cliente inválido");
        }
        
        Node novoNode = new Node(cliente);
        
        if (estaVazia()) {
            frente = novoNode;
            tras = novoNode;
        } else {
            tras.proximo = novoNode;
            tras = novoNode;
        }
    }
    
    public Elemento atenderProximo() {
        if (estaVazia()) {
            System.out.println("A fila está vazia");
        }
        
        Elemento clienteAtendido = frente.valor;
        frente = frente.proximo;
        
        if (frente == null) {
            tras = null;
        }

        return clienteAtendido;
    }
    
    public boolean estaVazia() {
        return (frente == null);
    }

    public void mostrarFila() {
        if (estaVazia()) {
            System.out.println("Fila vazia");
            return;
        }
        
        Node atual = frente;
        int posicao = 1;
        
        while (atual != null) {
            System.out.println("Posição " + posicao + " na fila:");
            System.out.println("ID: " + atual.valor.id);
            System.out.println("Nome: " + atual.valor.nome);
            System.out.println("Descrição: " + atual.valor.descricao);
            System.out.println("-----------------");
            
            atual = atual.proximo;
            posicao = posicao + 1;
        }
    }
}
