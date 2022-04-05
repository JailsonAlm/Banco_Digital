package desafio.dio.banco.entity;

public class Main {

    public static void main(String[] args) {
        Cliente jailson = new Cliente();
        jailson.setNome("Jailson");

        Conta cc = new ContaCorrente(jailson);
        Conta poupanca = new ContaPoupanca(jailson);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
