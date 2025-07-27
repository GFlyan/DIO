package sistemaBancario;

public class Cliente extends Pessoa {

    private Banco bancoAssociado;
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;

    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }

    public Banco getBancoAssociado() {
        return bancoAssociado;
    }

    public void setBancoAssociado(Banco banco) {
        if (bancoAssociado != null) return;
        bancoAssociado = banco;
        bancoAssociado.addCliente(this);
    }

    public void deleteBancoAssociado() {
        if (bancoAssociado == null) return;
        if(contaCorrente != null) deleteContaCorrente();
        if(contaPoupanca != null) deleteContaPoupanca();
        bancoAssociado.removeCliente(this);
        bancoAssociado = null;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente() {
        if(contaCorrente != null || bancoAssociado == null) return;
        contaCorrente = new ContaCorrente(bancoAssociado);
        bancoAssociado.addContaCorrente(this);
    }

    public void deleteContaCorrente() {
        if(contaCorrente == null || bancoAssociado == null) return;
        bancoAssociado.removeContaCorrente(this);
        contaCorrente = null;
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca() {
        if(contaPoupanca != null || bancoAssociado == null) return;
        contaPoupanca = new ContaPoupanca(bancoAssociado);
        bancoAssociado.addContaPoupanca(this);
    }

    public void deleteContaPoupanca() {
        if(contaPoupanca == null) return;
        bancoAssociado.removeContaPoupanca(this);
        contaPoupanca = null;
    }

    @Override
    public String toString() {
        return  "=====================================\n" +
                "                Cliente              \n" +
                "=====================================\n" +
                "Nome: "   + nome +  "\n" +
                "CPF: "    + cpf +   "\n" +
                "Banco Associado: " + bancoAssociado.getNome() + "\n" +
                "=====================================";
    }
}
