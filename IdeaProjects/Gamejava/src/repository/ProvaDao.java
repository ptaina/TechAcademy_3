package repository;

import model.Cena;

public class ProvaDao {
    private Integer provaId;
    private Integer jogadorId;
    private String descricao;
    private Cena cenaEncontrada;
    private Integer inventarioId;

    public Integer getProvaId() {
        return provaId;
    }

    public void setProvaId(Integer provaId) {
        this.provaId = provaId;
    }

    public Integer getInventarioId() {
        return inventarioId;
    }

    public void setInventarioId(Integer inventarioId) {
        this.inventarioId = inventarioId;
    }

    public Cena getCenaEncontrada() {
        return cenaEncontrada;
    }

    public void setCenaEncontrada(Cena cenaEncontrada) {
        this.cenaEncontrada = cenaEncontrada;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getJogadorId() {
        return jogadorId;
    }

    public void setJogadorId(Integer jogadorId) {
        this.jogadorId = jogadorId;
    }

    @Override
    public String toString() {
        return "ProvaDao{" +
                "provaId=" + provaId +
                ", jogadorId=" + jogadorId +
                ", descricao='" + descricao + '\'' +
                ", cenaEncontrada=" + cenaEncontrada +
                ", inventarioId=" + inventarioId +
                '}';
    }
}
