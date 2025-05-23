    public class RegistroNotas {
        private NossoHash<String, Double> boletim = new NossoHash<>();

        @SuppressWarnings("unchedcked")
        public RegistroNotas() {
            bolteim = new NossoHash<>();
        }
        public void cadstraNptas (String, aluno, Double nota) {
        boletim.put(aluno, nota);
        }
        public static void main(String[] args) {
            RegistroNotas registroNotas = new RegistroNotas();
        }
        NossoHash<String, Double> boletim = new NossoHash<>();
        registroNotas.put("Ana", 2.5);
        registroNotas.put("Bia", 4.7);
        registroNotas.put("Caio", 3.9);
        registroNotas.put("Carlos", 6.8);
        registroNotas.put("Ana", 6.5);
        registroNotas.put("Bia", 7.7);
        registroNotas.put("Caio", 5.9);
        registroNotas.put("Carlos", 8.8);
        boletim.imprime();
        System.out.println("Notas da Bia\n" + boletim.getListaValores("Bia"));
        System.out.println("Notas do Joao\n" + boletim.getListaValores("Joao"));
    }
