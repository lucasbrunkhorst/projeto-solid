package com.lucasbrunkhorst.service.reajuste;

import com.lucasbrunkhorst.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;
    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
        this.validacoes.forEach(v -> v.validar(funcionario, aumento));
        BigDecimal salarioAjustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioAjustado);
    }
}
