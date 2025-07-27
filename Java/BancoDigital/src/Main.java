import sistemaBancario.Cliente;


public class Main {
    public static void main(String[] args) {
        // Crie o cliente aqui
        Cliente cliente = new Cliente("Guilherme", "...-...-...-..");
        // Defina o banco de acordo com os bancos existentes
        cliente.setBancoAssociado(Bancos.santander);
        cliente.setContaCorrente();
        cliente.setContaPoupanca();
        // Visualize as informações
        System.out.println(cliente);
        System.out.println(cliente.getBancoAssociado());
        System.out.println(cliente.getContaCorrente());
        System.out.println(cliente.getContaPoupanca());
    }
}