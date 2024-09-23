package model;

public class Escolha {
    private Integer escolhaId;
    private Integer jogadorId;
    private Cena cena;
    private String escolha;

    public Integer getEscolhaId() {
        return escolhaId;
    }

    public void setEscolhaId(Integer escolhaId) {
        this.escolhaId = escolhaId;
    }

    public String getEscolha() {
        return escolha;
    }

    public void setEscolha(String escolha) {
        this.escolha = escolha;
    }

    public Cena getCena() {
        return cena;
    }

    public void setCena(Cena cena) {
        this.cena = cena;
    }

    public Integer getJogadorId() {
        return jogadorId;
    }

    public void setJogadorId(Integer jogadorId) {
        this.jogadorId = jogadorId;
    }

    @Override
    public String toString() {
        return "Escolha{" +
                "escolhaId=" + escolhaId +
                ", jogadorId=" + jogadorId +
                ", cena=" + cena +
                ", escolha='" + escolha + '\'' +
                '}';
    }
}
