package service.impl;

import service.ContaEstacionamento;
import service.ValoresEstacionamento;

import java.math.BigDecimal;


public class ContaVeiculoDiaria implements ContaEstacionamento {

    @Override
    public BigDecimal obterTotalAPagar(int tempoDePermanencia) {
        int diasEstacionado = tempoDePermanencia / 24;

        return ValoresEstacionamento.VALOR_DIARIA.multiply(new BigDecimal(diasEstacionado));
    }
}
