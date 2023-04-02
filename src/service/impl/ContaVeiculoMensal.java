package service.impl;

import service.ContaEstacionamento;
import service.ValoresEstacionamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ContaVeiculoMensal implements ContaEstacionamento {

    @Override
    public BigDecimal obterTotalAPagar(int tempoDePermanencia) {
        if (tempoDePermanencia > 360) {
            return ValoresEstacionamento.VALOR_MENSALIDADE;
        }
        return tempoDePermanencia > 12
                ? ValoresEstacionamento.VALOR_DIARIA.multiply(new BigDecimal(12)) :
                ValoresEstacionamento.VALOR_HORA.multiply(new BigDecimal(5));
    }
}
