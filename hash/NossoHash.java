public class NossoHash <K, V> {
    private Entrada<K, V> [] tabela;
    private int capacidade = 16;
    public NossoHash() {
        tabela = new Entrada[capacidade];
    }
    private int has (K key) {
        return key.hashCode() % capacidade;
    }
    public void put (K key, V value) {
        int indice = hash(key);
        Entrada<K, V> entrada = new Entrada<NossoHash.K,NossoHash.V>(key, value);
    }
}