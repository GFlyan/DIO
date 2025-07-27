package sistemaBancario;

public class ContaCorrente extends Conta{

    ContaCorrente(Banco banco) {
        super(banco);
    }

    @Override
    public String toString() {
        return  "=====================\n" +
                "   Conta Corrente    \n" +
                "=====================\n" +
                "Banco: " + bancoAssociado.getNome() + "\n" +
                "Agência: " + agencia + "\n" +
                "Número: " + numero + "\n" +
                "Saldo: " + saldo + "\n" +
                "=====================";
    }
}
