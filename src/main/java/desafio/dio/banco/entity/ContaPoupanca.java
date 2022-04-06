package desafio.dio.banco.entity;

import lombok.Builder;


@Builder
public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public ContaPoupanca(int agencia, int numero, double saldo, Cliente cliente) {
        super(agencia, numero, saldo, cliente);
    }

    public ContaPoupanca() {
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
