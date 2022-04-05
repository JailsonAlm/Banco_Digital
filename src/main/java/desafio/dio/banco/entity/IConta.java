package desafio.dio.banco.entity;

public interface IConta {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();

    // Não faz sentido colocar public em uma variável dentro de uma entidade, isso seria redundante;
}
