public class Elemento {
    String id;
    String descricao;
    String nome;
    String dataHora;
    Boolean fila;//auxiliar
    Boolean pilha;//auxiliar
    public  Elemento(String id,String nomeOuDesc, String descOuDataHora) {
        this.id=id;
        if(id.substring(0,1).equals("R")){//o unico jeito que eu pensei em q usa o mesmo objeto, para duas instancias que realisticamente deviam ser objetos completamente diferentes
            this.pilha=true;
            this.fila = false;
            this.descricao=nomeOuDesc;
            this.dataHora=descOuDataHora;
        }
        else{
            this.pilha=false;
            this.fila = true;
            this.nome=nomeOuDesc;
            this.descricao=descOuDataHora;
        }
    }
}
