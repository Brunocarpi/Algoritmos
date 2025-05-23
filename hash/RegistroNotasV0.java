public class RegistroNotasV0 {
    public static void main(String[] args) {
        NossoHash<String, Double> boletim = new NossoHash<>();
        boletim.put("Ana", 2.5);
        boletim.put("Bia", 4.7);
        boletim.put("Caio", 3.9);
        boletim.put("Carlos", 6.8);
        boletim.put("Ana", 6.5);
        boletim.put("Bia", 7.7);
        boletim.put("Caio", 5.9);
        boletim.put("Carlos", 8.8);
        boletim.imprime();
        System.out.println("Notas da Bia\n" + boletim.getListaValores("Bia"));
        System.out.println("Notas do Joao\n" + boletim.getListaValores("Joao"));
    }
}