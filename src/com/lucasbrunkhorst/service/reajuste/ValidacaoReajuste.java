package com.lucasbrunkhorst.service.reajuste;

import com.lucasbrunkhorst.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

    void validar(Funcionario funcionario, BigDecimal aumento);
}
