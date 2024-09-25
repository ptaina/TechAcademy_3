package model;

public class Cena {
    private Integer cenaId;
    private String descricao;
    private Integer proximaCenaA;
    private Integer proximaCenaB;
    private Integer proximaCenaC;
    private Integer personagemId;

    public Integer getCenaId() {
        return cenaId;
    }

    public void setCenaId(Integer cenaId) {
        this.cenaId = cenaId;
    }

    public Integer getPersonagemId() {
        return personagemId;
    }

    public void setPersonagemId(Integer personagemId) {
        this.personagemId = personagemId;
    }

    public Integer getProximaCenaC() {
        return proximaCenaC;
    }

    public void setProximaCenaC(Integer proximaCenaC) {
        this.proximaCenaC = proximaCenaC;
    }

    public Integer getProximaCenaB() {
        return proximaCenaB;
    }

    public void setProximaCenaB(Integer proximaCenaB) {
        this.proximaCenaB = proximaCenaB;
    }

    public Integer getProximaCenaA() {
        return proximaCenaA;
    }

    public void setProximaCenaA(Integer proximaCenaA) {
        this.proximaCenaA = proximaCenaA;
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
                "cenaId=" + cenaId +
                ", descricao='" + descricao + '\'' +
                ", proximaCenaA=" + proximaCenaA +
                ", proximaCenaB=" + proximaCenaB +
                ", proximaCenaC=" + proximaCenaC +
                ", personagemId=" + personagemId +
                '}';
    }
}


