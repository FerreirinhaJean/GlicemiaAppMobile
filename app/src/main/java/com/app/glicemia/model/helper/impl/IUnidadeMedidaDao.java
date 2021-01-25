package com.app.glicemia.model.helper.impl;

import com.app.glicemia.model.entities.UnidadeMedida;

import java.util.List;

public interface IUnidadeMedidaDao {

    public boolean salvarUnidadeMedida(UnidadeMedida unidadeMedida);

    public boolean atualizarUnidadeMedida(UnidadeMedida unidadeMedida);

    public boolean deletarUnidadeMedida(UnidadeMedida unidadeMedida);

    public List<UnidadeMedida> listaUnidadeMedida();

}
