package desafio.dio.banco.entity;


import lombok.Builder;


@Builder
public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public ContaCorrente(int agencia, int numero, double saldo, Cliente cliente) {
        super(agencia, numero, saldo, cliente);
    }

    public ContaCorrente() {
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
