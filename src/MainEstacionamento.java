

import service.ContaEstacionamento;
import service.ValoresEstacionamento;
import service.impl.ContaVeiculoDiaria;
import service.impl.ContaVeiculoHoras;
import service.impl.ContaVeiculoMensal;

import java.time.LocalDateTime;


class MainEstacionamento {

    public static void main(String[] args) {

        ContaEstacionamento contaDiaria = new ContaVeiculoDiaria();
        ContaEstacionamento contaHora = new ContaVeiculoHoras();
        ContaEstacionamento contaMensal = new ContaVeiculoMensal();



        Veiculo veiculo = new Veiculo("ABC-123", "Chevrolet Onix", "Azul");
        // Calculo do total a pagar por Hora
        LocalDateTime entrada = LocalDateTime.of(2022, 8, 1, 11, 0, 0);
        LocalDateTime saida = LocalDateTime.of(2022, 8, 1, 12, 10, 0);
        Estacionamento estacionamento = new Estacionamento(entrada, saida, veiculo);

        estacionamento.setContaEstacionamento(contaHora);
        System.out.println("Pagamento por Hora");
        System.out.println("-------------------");
        System.out.println(estacionamento.obterTotalAPagar());

        // Calculo do total a pagar por Diaria
        entrada = LocalDateTime.of(2022, 8, 1, 0, 0, 0);
        saida = LocalDateTime.of(2022, 8, 5, 0, 0, 0);
        estacionamento.setEntrada(entrada);
        estacionamento.setSaida(saida);
        estacionamento.setVeiculo(veiculo);
        estacionamento.setContaEstacionamento(contaDiaria);
        System.out.println("\nPagamento por Diaria");
        System.out.println("---------------------");
        System.out.println(estacionamento.obterTotalAPagar());

        // Calculo do total a pagar por mensalidade
        entrada = LocalDateTime.of(2022, 7, 1, 0, 0, 0);
        saida = LocalDateTime.of(2022, 8, 5, 0, 0, 0);
        estacionamento.setEntrada(entrada);
        estacionamento.setSaida(saida);
        estacionamento.setVeiculo(veiculo);
        estacionamento.setContaEstacionamento(contaMensal);
        System.out.println("\nPagamento por Mensalidade");
        System.out.println("---------------------");
        System.out.println(estacionamento.obterTotalAPagar());

    }
}
