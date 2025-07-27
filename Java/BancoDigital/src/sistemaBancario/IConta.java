package sistemaBancario;

public interface IConta {

    boolean deposito(double valor);

    boolean saque(double valor);

    boolean transferencia(Conta contaDestino, double valor);
}
