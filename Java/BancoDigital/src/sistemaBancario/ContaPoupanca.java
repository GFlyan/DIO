package sistemaBancario;

public class ContaPoupanca extends Conta {

    ContaPoupanca(Banco banco) {
        super(banco);
    }

    @Override
    public String toString() {
        return  "=====================\n" +
                "   Conta Poupança    \n" +
                "=====================\n" +
                "Banco: " + bancoAssociado.getNome() + "\n" +
                "Agência: " + agencia + "\n" +
                "Número: " + numero + "\n" +
                "Saldo: " + saldo + "\n" +
                "=====================";
    }
}


