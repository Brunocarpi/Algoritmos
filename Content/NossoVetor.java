package Content;

import java.util.Random;

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

    // void aumentarVetor() {
    //     int[] temp = new int[vetor.length * 2];
    //     for (int i = 0; i<ocupacao; i++) {
    //         temp[i] = vetor[i];
    //     }
    //     vetor = temp;
    // }
    // void reduzVetor(){
    //     int []temp = new int[vetor.length/2];
    //     for (int i=0; i<ocupacao; i++){
    //         temp[i] = vetor[i];
    //     }
    //     vetor = temp;
    // }

    // Flexibiliza o código
    void redimensionarVetor(int NovoTamanho) {
        int[] temp = new int[NovoTamanho];
        for (int i = 0; i<ocupacao; i++) {
            temp[i] = vetor[i];
        }
        vetor = temp;
    }

    public void insere(int i) {
        if (estaCheio()) {
            redimensionarVetor(vetor.length*2);
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
        if (!estaVazio()){
            int aux = vetor[--ocupacao];
            if (vetor.length>=6 && ocupacao <= vetor.length/4){
                redimensionarVetor(vetor.length/2);
            } return aux;
        }
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
    public int getTamanho(){
        return vetor.length;
    }
    public void preencheVetor(){
        Random random = new Random();
        for (int i=0; i<vetor.length; i++){
            vetor[i] = random.nextInt(vetor.length*10);

        }
        ocupacao = vetor.length;
    }
}