package desafio.dio.banco.entity;

public class Main {

    public static void main(String[] args) {
        Cliente jailson = new Cliente();
        jailson.setNome("Jailson");

        Conta cc = new ContaCorrente(jailson);
        Conta poupanca = new ContaPoupanca(jailson);
        cc.depositar(100);
        cc.transferir(100, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
