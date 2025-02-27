package Content;
public class NossoVetor {
    private int[] vetor;
    private int ocupacao;


    public NossoVetor(int tamanho) {
        vetor = new int[tamanho];
        // por clareza
        ocupacao = 0;
    }


    public NossoVetor() {
        // Sempre que um construtor chamar o outro, faça a chamada na 1ª linha
        this(10); // Construtor
    }


    void aumentarVetor() {
        int[] temp = new int[vetor.length * 2];
        for (int i = 0; i < vetor.length; i++) {
            temp[i] = vetor[i];
        }
        vetor = temp;
    }


    public void insere(int i) {
        if (!estaCheio()) {
            aumentarVetor();
        }
        vetor[ocupacao++] = i;
    }


    public boolean estaCheio() {
        // Compilador faz a verificação (verdadeiro ou falso)
        return ocupacao == vetor.length;
    }


    public boolean estaVazio() {
        return ocupacao == 0;
    }


    public int remove() {
        if (!estaVazio())
            return vetor[--ocupacao];
        return -1;
    }


    @Override
    public String toString() {
        String s = "ocupacao = " + ocupacao + "\n";
        for (int i = 0; i < ocupacao; i++) {
            s += vetor[i] + " ";
        }
        return s + "\n";
    }
}
