public class ArvoreBinaria{
    private No raiz;
    //construtor padrão
    public boolean arvoreVazia(){
        return raiz == null;
    }
    public void insere(int info){
        No novo = new No(info);
        if (arvoreVazia())
            raiz = novo;
        else
            insereRec(novo, raiz);
    }
    public void insereRec(No novo, No atual){
        if (novo.getInfo() > atual.getInfo()){
            if (atual.getDireita() == null)
                atual.setDireita(novo);
            else
                insereRec(novo, atual.getDireita());
        }
        else{
            if(atual.getEsquerda()==null)
                atual.setEsquerda(novo);
            else
                insereRec(novo, atual.getEsquerda());
        }
    }
    // usar o percurso em ordem simétrica para construir o toString
    @Override
    public String toString (){
        if (arvoreVazia()) return "arvore vazia";
        return toStringRec(raiz);
    }
    private String toStringRec(No atual){
        String s = "";
        if (atual.getEsquerda() != null)
            s = s + toStringRec(atual.getEsquerda());
        s = s+atual+" ";
        if (atual.getDireita() != null)
            s = s + toStringRec(atual.getDireita());
        return s;
    }
}
class No{
    private int info;
    private No esquerda;
    private No direita;
    public No(int info){
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
    public int getInfo() {
        return info;
    }
    @Override
    public String toString (){
        return info + "";
    }
}