package com.app.glicemia.model.helper.impl;

import com.app.glicemia.model.entities.Alimento;

import java.util.List;

public interface IAlimentoDao {

    public boolean salvarAlimento(Alimento alimento);

    public boolean atualizarAlimento(Alimento alimento);

    public boolean deletarAlimento(Alimento alimento);

    public List<Alimento> listaAlimentos();
}
