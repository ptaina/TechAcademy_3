package model;

public class Jogador {
    private Integer jogadorId;
    private String nome;
    private Integer idade;
    private Integer progressoCena;


    public Jogador() {
    }


    public Jogador(Integer jogadorId, String nome, Integer idade, Integer progressoCena) {
        this.jogadorId = jogadorId;
        this.nome = nome;
        this.idade = idade;
        this.progressoCena = progressoCena;
    }


    public Integer getJogadorId() {
        return jogadorId;
    }

    public void setJogadorId(Integer jogadorId) {
        this.jogadorId = jogadorId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getProgressoCena() {
        return progressoCena;
    }

    public void setProgressoCena(Integer progressoCena) {
        this.progressoCena = progressoCena;
    }


    @Override
    public String toString() {
        return "Jogador{" +
                "jogadorId=" + jogadorId +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", progressoCena=" + progressoCena +
                '}';
    }
}
