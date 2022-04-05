package desafio.dio.banco.entity;


public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public ContaPoupanca() {

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
