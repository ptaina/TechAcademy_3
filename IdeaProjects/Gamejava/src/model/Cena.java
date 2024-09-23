package model;

public class Cena {
    private Integer CenaId;
    private String descricao;

    public Integer getCenaId() {
        return CenaId;
    }

    public void setCenaId(Integer cenaId) {
        CenaId = cenaId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Cena{" +
                "CenaId=" + CenaId +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}


