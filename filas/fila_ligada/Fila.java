public class Fila {
    private No primeiro;
    private No ultimo;
    //construtor padrão
    public boolean filaVazia() {
        return primeiro == null;
    }
    public void enfileira(int e) {
        No novo = new No(e);
        if (filaVazia())
            primeiro = novo;
        else   
            ultimo.setProximo(novo);
        ultimo = novo;
    }
    public int desenfileira () {
        if (filaVazia()) throw new RuntimeException("Falha na remocao");
        int temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) //esvaziou a fila
            ultimo = null; //evitar memory leak (vazamento de memória)
        return temp;
    }
    @Override
    public String toString() {
        if (filaVazia()) return "Fila vazia";
        String s = "";
        No runner = primeiro;
        while (runner != null){
            s = s + runner + " -> ";
            runner = runner.getProximo();
        }
        return s;
    }
}
class No {
    private int info;
    private No proximo;

    public No(int info) { //método construtor
        this.info = info;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) { //getters and setters para proximo
        this.proximo = proximo;
    }

    public int getInfo() {
        return info;
    }
    @Override
    public String toString () {
        return "[" + info + "]";
    }

}
