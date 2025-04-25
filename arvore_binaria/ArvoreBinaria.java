public class ArvoreBinaria {
    private No raiz;
    //construtor padrão
    public boolean arvoreVazia () {
        return raiz == null;
    }
    public void insere (int info) {
        No novo = new No(info);
        if (arvoreVazia())
            raiz = novo;
        else
            insereRec(novo, raiz);
    }
    public void insereRec (No novo, No atual) {
        
    }
    
}
class No {
    private int info;
    private No esquerda;
    private No direita;
    public No (int info) {

    }
    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    public No getEsquerda() {
        return esquerda;
    }
    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }
    public No getDireita() {
        return direita;
    }
    public void setDireita(No direita) {
        this.direita = direita;
    }

}
