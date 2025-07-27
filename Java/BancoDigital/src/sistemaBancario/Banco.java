package sistemaBancario;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private NomeBancos nome;
    private int agencia;
    private int numeroParaContas;
    private List<Cliente> clientes;
    private List<ContaCorrente> contasCorrente;
    private List<ContaPoupanca> contasPoupanca;

    public NomeBancos getNome() {
        return nome;
    }

    public int getAgencia() {
        return agencia;
    }

    int getNumero() {
        return ++numeroParaContas;
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removeCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public void addContaCorrente(Cliente cliente) {
        contasCorrente.add(cliente.getContaCorrente());
    }

    public void removeContaCorrente(Cliente cliente) {
        contasCorrente.remove(cliente.getContaCorrente());
    }

    public void addContaPoupanca(Cliente cliente) {
        contasPoupanca.add(cliente.getContaPoupanca());
    }

    public void removeContaPoupanca(Cliente cliente) {
        contasPoupanca.remove(cliente.getContaPoupanca());
    }

    public Banco(NomeBancos nome, int agencia) {
        this.nome = nome;
        this.agencia = agencia;
        numeroParaContas = 0;
        clientes = new ArrayList<>();
        contasCorrente = new ArrayList<>();
        contasPoupanca = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "==================\n" +
               "       Banco      \n"  +
               "==================\n" +
               "Nome: " + nome + "\n" +
               "Agência: " + agencia + "\n" +
               "==================\n";
    }
}
