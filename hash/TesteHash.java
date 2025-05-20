public class TesteHash {
    public static void main(String[] args) {
        NossoHash<String, String> mapa = new NossoHash<>();
        mapa.put("12345", "aaaaa");
        mapa.put("6789", "fghjk");
        mapa.put("7654", "lmnop");
        mapa.put("87654", "qrstuv");
        mapa.put("4321", "wxuz");
        mapa.put("9876", "az");
        mapa.imprime();
        String retorno = mapa.get("87654");
        if (retorno!=null){
           System.out.println(retorno+" é o valor associado a sua chave"); 
        } else {
            System.out.println("Chave não encontrada");
        }
    }
}
