package service.impl;

import service.ContaEstacionamento;
import service.ValoresEstacionamento;

import java.math.BigDecimal;


public class ContaVeiculoHoras implements ContaEstacionamento {

    @Override
    public BigDecimal obterTotalAPagar(int tempoDePermanencia) {
        return ValoresEstacionamento.VALOR_HORA.multiply(new BigDecimal(tempoDePermanencia));
    }
}
