//Uma classe abstrata pode conter um método(); sem um corpo, ou seja, um método sem metodo {}
//Comparable é uma interface de tipo <T> que também é chamado de operador diamante


public class Pessoa implements Comparable<Pessoa> {
    private int id;
    private String nome;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
//Ao usar o @Override, isso indica que a assinatura do método não pode ser alterada
    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + "]";
    }
    @Override
    public int compareTo(Pessoa outraPessoa) {
        // if (this.id < outraPessoa.id) return -1;
        // if (this.id > outraPessoa.id) return 1;
        // return 0;
        return Integer.compare(this.id, outraPessoa.id);
    }
}
