package model;

public class Prova {
    private Integer provaId;
    private String descricao;
    private Integer cenaEncontrada;
    private Integer inventarioId;

    public Integer getProvaId() {
        return provaId;
    }

    public void setProvaId(Integer provaId) {
        this.provaId = provaId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCenaEncontrada() {
        return cenaEncontrada;
    }

    public void setCenaEncontrada(Integer cenaEncontrada) {
        this.cenaEncontrada = cenaEncontrada;
    }

    public Integer getInventarioId() {
        return inventarioId;
    }

    public void setInventarioId(Integer inventarioId) {
        this.inventarioId = inventarioId;
    }
}
