public class TesteMerge {
    public static void main(String[] args) {
        NossoVetor v = new NossoVetor(); //tamanho padrão é 10
        v.preencheVetor();
        System.err.println(v);
        v.mergeSort(0, v.getTamanho()-1);
        System.err.println(v);
    }
}
