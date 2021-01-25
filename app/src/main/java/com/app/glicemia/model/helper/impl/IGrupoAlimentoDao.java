package com.app.glicemia.model.helper.impl;

import com.app.glicemia.model.entities.GrupoAlimento;

import java.util.List;

public interface IGrupoAlimentoDao {

    public boolean salvarGrupoAlimento(GrupoAlimento grupoAlimento);

    public boolean atualizarGrupoAlimento(GrupoAlimento grupoAlimento);

    public boolean deletarGrupoAlimento(GrupoAlimento grupoAlimento);

    public List<GrupoAlimento> listaGruposAlimentos();
}
