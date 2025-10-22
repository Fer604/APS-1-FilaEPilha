public class Elemento {

    String id;
    String descricao;
    String nome;
    String dataHora;
    Boolean fila;// auxiliar
    Boolean pilha;// auxiliar

    public Elemento(String id, String nomeDesc, String descDataHora) {

        this.id = id;

        if (id.substring(0, 1).equals("R")) {
            // o unico jeito que eu pensei em q usa o mesmo objeto, para duas instancias que
            // realisticamente deviam ser objetos completamente diferentes
            this.pilha = true;
            this.fila = false;
            this.descricao = nomeDesc;
            this.dataHora = descDataHora;
        } else {
            this.pilha = false;
            this.fila = true;
            this.nome = nomeDesc;
            this.descricao = descDataHora;
        }

    }
}
