import java.util.Random;

public class TesteArvoreBinaria {
    public static void main(String[] args) {
        Random random = new Random();
        ArvoreBinaria abb = new ArvoreBinaria();
        ArvoreBinaria abbOcorrencia = new ArvoreBinaria();
        for (int i=1; i<=10; i++) {
            int n = random.nextInt(100);
            System.out.println(n + " ");
            abb.insere(n);
            abbOcorrencia.insereOcorrencias(n);
        }
        System.out.println();
        System.out.println(abb);
        System.out.println(abbOcorrencia);
    }
}
