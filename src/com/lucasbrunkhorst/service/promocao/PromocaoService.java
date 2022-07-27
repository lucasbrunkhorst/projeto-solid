package com.lucasbrunkhorst.service.promocao;

import com.lucasbrunkhorst.ValidacaoException;
import com.lucasbrunkhorst.model.Cargo;
import com.lucasbrunkhorst.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida) {
        Cargo cargoAtual = funcionario.getCargo();
        if (Cargo.GERENTE == funcionario.getCargo()) {
            throw new ValidacaoException("Gerentes nao podem ser promovidos!");
        }
        if (metaBatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionario nao bateu a meta para promoção!");
        }
    }
}
