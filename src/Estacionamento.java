import service.ContaEstacionamento;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class Estacionamento {

    private LocalDateTime entrada;
    private LocalDateTime saida;
    private Veiculo veiculo;



    private ContaEstacionamento contaEstacionamento;

    //BigDecimal: ponto flutuante em que é possível estipular o nível de precisão desejado

    
    public Estacionamento(LocalDateTime entrada, LocalDateTime saida, Veiculo veiculo) {
    	this.entrada = entrada;
    	this.saida = saida;
    	this.veiculo = veiculo;
    }

    public LocalDateTime getEntrada() {
		return entrada;
	}

	public void setEntrada(LocalDateTime entrada) {
		this.entrada = entrada;
	}

	public LocalDateTime getSaida() {
		return saida;
	}

	public void setSaida(LocalDateTime saida) {
		this.saida = saida;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
    public ContaEstacionamento getContaEstacionamento() {
        return contaEstacionamento;
    }

    public void setContaEstacionamento(ContaEstacionamento contaEstacionamento) {
        this.contaEstacionamento = contaEstacionamento;
    }

    public BigDecimal obterTotalAPagar() {
        assert(entrada != null && saida != null && veiculo != null);
        int tempo = Math.toIntExact(Duration.between(entrada, saida).toHours());
        return contaEstacionamento.obterTotalAPagar(tempo);
    }

}
