package com.app.glicemia.model.entities;

public class Alimento {

    private Long id;
    private String descricao;
    private Integer quantidadeUnidade;

    private Long idGrupoAlimento;
    private Long idUnidadeMedida;

    public Alimento(){

    }

    public Alimento(Long id, String descricao, Integer quantidadeUnidade, Long idGrupoAlimento, Long idUnidadeMedida) {
        this.id = id;
        this.descricao = descricao;
        this.quantidadeUnidade = quantidadeUnidade;
        this.idGrupoAlimento = idGrupoAlimento;
        this.idUnidadeMedida = idUnidadeMedida;
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

    public Integer getQuantidadeUnidade() {
        return quantidadeUnidade;
    }

    public void setQuantidadeUnidade(Integer quantidadeUnidade) {
        this.quantidadeUnidade = quantidadeUnidade;
    }

    public Long getIdGrupoAlimento() {
        return idGrupoAlimento;
    }

    public void setIdGrupoAlimento(Long idGrupoAlimento) {
        this.idGrupoAlimento = idGrupoAlimento;
    }

    public Long getIdUnidadeMedida() {
        return idUnidadeMedida;
    }

    public void setIdUnidadeMedida(Long idUnidadeMedida) {
        this.idUnidadeMedida = idUnidadeMedida;
    }
}
