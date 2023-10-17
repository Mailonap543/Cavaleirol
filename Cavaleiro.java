interface Ataque {
    void executarAtaque();
}

class Cavaleiro {
    private String nome;
    private String constelacao;

    public Cavaleiro(String nome, String constelacao) {
        this.nome = nome;
        this.constelacao = constelacao;
    }

    public String getNome() {
        return nome;
    }

    public String getConstelacao() {
        return constelacao;
    }
}
