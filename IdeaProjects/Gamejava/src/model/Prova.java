package model;

import java.sql.SQLException;

import static repository.CenaDao.findCenaById;

public class Prova {
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

    public Integer getJogadorId() {
        return jogadorId;
    }

    public void setJogadorId(Integer jogadorId) {
        this.jogadorId = jogadorId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cena getCenaEncontrada() {
        return cenaEncontrada;
    }

    public void setCenaEncontrada(int cenaId) {
        try {
            this.cenaEncontrada = findCenaById(cenaId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Integer getInventarioId() {
        return inventarioId;
    }

    public void setInventarioId(Integer inventarioId) {
        this.inventarioId = inventarioId;
    }
}


