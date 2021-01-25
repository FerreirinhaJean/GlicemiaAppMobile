package com.app.glicemia.model.entities;

public class GrupoAlimento {

    private Long id;
    private String descricao;

    public GrupoAlimento(){

    }

    public GrupoAlimento(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
