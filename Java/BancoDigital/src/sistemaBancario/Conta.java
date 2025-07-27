package sistemaBancario;

public abstract class Conta implements IConta{

    protected Banco bancoAssociado;
    protected int agencia;
    protected int numero;
    protected double saldo;


    protected Conta(Banco banco) {
        bancoAssociado = banco;
        agencia = bancoAssociado.getAgencia();
        numero = bancoAssociado.getNumero();
        saldo = 0;
    }

    @Override
    public boolean deposito(double valor) {
        if (valor <= 0) return false;
        saldo += valor;
        return true;
    }

    @Override
    public boolean saque(double valor) {
        if(saldo < valor || valor <= 0) return false;
        saldo -= valor;
        return true;
    }

    @Override
    public boolean transferencia(Conta contaDestino, double valor) {
        if(saldo < valor || valor <= 0) return false;
        saldo -= valor;
        contaDestino.deposito(valor);
        return true;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
