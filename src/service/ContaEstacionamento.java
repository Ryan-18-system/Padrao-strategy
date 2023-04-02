package service;

import java.math.BigDecimal;

public interface ContaEstacionamento {
    BigDecimal obterTotalAPagar(int tempoDePermanencia);
}
