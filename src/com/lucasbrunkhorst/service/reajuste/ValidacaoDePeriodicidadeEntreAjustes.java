package com.lucasbrunkhorst.service.reajuste;

import com.lucasbrunkhorst.ValidacaoException;
import com.lucasbrunkhorst.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoDePeriodicidadeEntreAjustes implements ValidacaoReajuste {

    public void validar(Funcionario funcionario, BigDecimal aumento) {

        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if (mesesDesdeUltimoReajuste < 6) {
            throw new ValidacaoException("Intervalo entre reajustes deve ser de no minimo 6 meses!");
        }

    }
}
